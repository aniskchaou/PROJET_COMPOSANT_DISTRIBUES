
/*la classe  recording permet faire des entregistrement et enregiterles fichiers enregisre dans 
le dossier recording*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JList;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Recording {

    public static Thread renregistrement_thread;
    public static Thread lecture_enregistrement_wav;
    public static Runnable enregistrement;
    public static Runnable lecture_enregistrement;

    private File wavFile;
    private AudioFileFormat.Type fileType ;
    private TargetDataLine line;
    public static String filename;

    public Recording() {
        fileType = AudioFileFormat.Type.WAVE;
    }

    //parametrage de fichier de l'enregistrement  genere 
    AudioFormat parametrage_enregistrement() {
        float sampleRate = 16000;
        int sampleSizeInBits = 8;
        int channels = 2;
        boolean signed = true;
        boolean bigEndian = true;
        AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits,
        channels, signed, bigEndian);
        return format;
    }

    //la liste des fichier wav dans le dossier recording
    String[] getListeFichiersWAV() {
        File folder = new File("recording");
        File[] listOfFiles = folder.listFiles();
        String names[] = new String[listOfFiles.length];
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                names[i] = listOfFiles[i].getName();
            } else if (listOfFiles[i].isDirectory()) {

            }

        }
        return names;
    }

//afficher la liste des fichier d'enregistrement            
    void afficher_liste_record(JList list_recording) {
        String names[] = getListeFichiersWAV();
        list_recording.setListData(names);

    }

//demarrer l'enregisrement  
    void demarrerEnregistrement(String filename) {

        enregistrement = () -> {
            try {
                wavFile = new File("recording/" + filename);
                AudioFormat format = parametrage_enregistrement();
                DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

                if (!AudioSystem.isLineSupported(info)) {
                    System.exit(0);
                }
                line = (TargetDataLine) AudioSystem.getLine(info);
                line.open(format);
                line.start();
                AudioInputStream ais = new AudioInputStream(line);
                AudioSystem.write(ais, fileType, wavFile);

            } catch (LineUnavailableException ex) {
                ex.printStackTrace();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        };
        renregistrement_thread = new Thread(enregistrement);
        renregistrement_thread.start();
    }

    //arret de recording
    void arreterEnregistrement() {
        line.stop();
        line.close();
    }

    //lire le fichier WAV genere
    void lectureEnregistrement(String filename) {
        lecture_enregistrement = () -> {
            FileInputStream fis = null;
            System.out.println("Recording.playwav()" + "recording\\" + filename + ".wav");
            try {
                fis = new FileInputStream("recording\\" + filename + ".wav");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Music.class.getName()).log(Level.SEVERE, null, ex);
            }
            Player playMP3 = null;
            try {
                playMP3 = new Player(fis);
            } catch (JavaLayerException ex) {
                Logger.getLogger(Music.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                playMP3.play();

            } catch (JavaLayerException ex) {
                Logger.getLogger(Music.class.getName()).log(Level.SEVERE, null, ex);
            }

        };

        lecture_enregistrement_wav = new Thread(lecture_enregistrement);
        lecture_enregistrement_wav.start();

    }

    public File getWavFile() {
        return wavFile;
    }

    public AudioFileFormat.Type getFileType() {
        return fileType;
    }

    public TargetDataLine getLine() {
        return line;
    }
}
