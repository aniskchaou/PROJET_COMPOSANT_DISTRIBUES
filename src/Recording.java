


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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Recording {
    public static Thread threadmp3;
    public static Thread threadmp2;
    public static Runnable runnable ;
    public static Runnable runnable2 ;
        // record duration, in milliseconds
    static final long RECORD_TIME = 60000;  // 1 minute
     
    // path of the wav file
    File wavFile ;
 
    // format of audio file
    AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
 
    // the line from which audio data is captured
    TargetDataLine line;
   String filename;
    /**
     * Defines an audio format
     */
    AudioFormat getAudioFormat() {
        float sampleRate = 16000;
        int sampleSizeInBits = 8;
        int channels = 2;
        boolean signed = true;
        boolean bigEndian = true;
        AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits,
                                             channels, signed, bigEndian);
        return format;
    }
 
    
            String[] getRecordingFiles()
    {
                File folder = new File("recording");
File[] listOfFiles = folder.listFiles();
String names[]=new String[listOfFiles.length];
for (int i = 0; i < listOfFiles.length; i++) {
  if (listOfFiles[i].isFile()) {
    System.out.println("File " + listOfFiles[i].getName());
    names[i]=listOfFiles[i].getName();
  } else if (listOfFiles[i].isDirectory()) {
    System.out.println("Directory " + listOfFiles[i].getName());
    
  }
  
    }
return names;
    }
            

            
   void afficher_liste_record(JList list_recording)
    {
        String names[]=getRecordingFiles();
        
               
       
       // b.setSelectedIndex(0);
         
        
        list_recording.setListData(names);
        

    }
    
    
    
    
    
    
    
    
    /**
     * Captures the sound and record into a WAV file
     */
    void start(String filename) {
        
         runnable = () -> {
        try {
           wavFile = new File("recording/"+filename);
            AudioFormat format = getAudioFormat();
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
 
            // checks if system supports the data line
            if (!AudioSystem.isLineSupported(info)) {
                System.out.println("Line not supported");
                System.exit(0);
            }
            line = (TargetDataLine) AudioSystem.getLine(info);
            line.open(format);
            line.start();   // start capturing
 
            System.out.println("Start capturing...");
 
            AudioInputStream ais = new AudioInputStream(line);
 
            System.out.println("Start recording...");
 
            // start recording
            AudioSystem.write(ais, fileType, wavFile);
 
        } catch (LineUnavailableException ex) {
            ex.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
         };
         threadmp3 = new Thread(runnable);
threadmp3.start();
    }
 
    /**
     * Closes the target data line to finish capturing and recording
     */
    void finish() {
        line.stop();
        line.close();
        System.out.println("Finished");
    }
 
    /**
     * Entry to run the program
     */
          void playwav(String filename)
    {
          runnable2 = () -> {
          FileInputStream fis = null;
              System.out.println("Recording.playwav()"+"recording\\"+filename+".wav");
             try {
                 fis = new FileInputStream("recording\\"+filename+".wav");
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

 threadmp2 = new Thread(runnable2);
threadmp2.start();
        
    }
}
