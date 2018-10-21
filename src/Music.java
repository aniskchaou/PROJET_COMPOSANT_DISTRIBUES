
/**
 * la classe Music permet de gerer la lecture des fichier mp3 et la navigation entre la liste de musique
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class Music {

    public static Thread lire_musique_thread;
    public static Runnable runnable;
    public String current_music;
    String names[];
    File folder;

    
    public Music() {
        String[] music_lists = getMusiques();
        current_music = music_lists[0];
    }

    
    
    //recherche dans le dossier la liste des fichiers mp3
    String[] getMusiques() {
        folder = new File("music");
        File[] listOfFiles = folder.listFiles();
        names = new String[listOfFiles.length];
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {

                names[i] = listOfFiles[i].getName().replace(".mp3", "");
            } else if (listOfFiles[i].isDirectory()) {
            }
        }
        return names;
    }

    
    
    //recherche l'index de la musique en cours de lecture dans la liste des fichiers mp3
    int getIndex(String curent_music) {
        String[] music_lists = getMusiques();
        int index = 0;
        for (int i = 0; i < music_lists.length; i++) {
            if (music_lists[i].equals(curent_music)) {
                index = i;
            }
        }
        return index;
    }

    
    
    //lire fichier mp3 dans un thread
    void playmp3(String filename) {
        runnable = () -> {
            FileInputStream fis = null;

            try {
                fis = new FileInputStream("music\\" + filename + ".mp3");
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

        lire_musique_thread = new Thread(runnable);
        lire_musique_thread.start();

    }

    
    
    //arreter la lecture de musique     
    void stopMusic() {
        if (lire_musique_thread.isAlive()) {
            System.out.print("true");
            try {
                lire_musique_thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Music.class.getName()).log(Level.SEVERE, null, ex);
            }
            lire_musique_thread.stop();
        }
    }

    
    
    
//afficher la liste de musique qui se touve dans le dossier music    
    void afficher_liste_musique(JList list_musique) {
        String names[] = getMusiques();
        JList b = new JList(names);
        b.setSelectedIndex(0);
        list_musique.setListData(names);

    }
    
    
    
//lecture de fichier mp3 suivant     
    void next() {
        stopMusic();
        int index = getIndex(current_music);
        String[] music_lists = getMusiques();
        if (index == music_lists.length) {
            index = 0;
            playmp3(music_lists[index]);
        }
        current_music = music_lists[index + 1];
        playmp3(music_lists[index + 1]);
    }
   
    
//lecture de fichier mp3 precedent     
    void previous() {
        stopMusic();
        int index = getIndex(current_music);
        System.err.println("" + index);
        String[] music_lists = getMusiques();

        if (index == 0) {
            index = 0;
            playmp3(music_lists[index]);
        }
        current_music = music_lists[index - 1];
        playmp3(music_lists[index - 1]);
    }

    
    
    
    
    public String[] getNames() {
        return names;
    }

    public File getFolder() {
        return folder;
    }

}
