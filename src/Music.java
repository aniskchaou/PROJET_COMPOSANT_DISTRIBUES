
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Music {
    
   public static Thread threadmp3;
    public static Runnable runnable ;
    public String current_music;
  String[]  getMusicFiles()
    {
         File folder = new File("music");
File[] listOfFiles = folder.listFiles();
String names[]=new String[listOfFiles.length];
for (int i = 0; i < listOfFiles.length; i++) {
  if (listOfFiles[i].isFile()) {
    System.out.println("File " + listOfFiles[i].getName());
    names[i]=listOfFiles[i].getName().replace(".mp3","");
  } else if (listOfFiles[i].isDirectory()) {
    System.out.println("Directory " + listOfFiles[i].getName());
    
  }  
    }

return names;

    }

    public Music() {
        String[] music_lists=getMusicFiles();
        current_music=music_lists[0];
    }
  
  int getIndex(String curent_music)
  {
      String[] music_lists=getMusicFiles();
      
      int index=0;
      for (int i = 0; i < music_lists.length; i++) {
         
         if(music_lists[i].equals(curent_music))
        {
              
              index=i;
         }
  System.err.println("curent_music" +curent_music+" "+music_lists[index]);
      }
      
       return index;
  }
  
      void playmp3(String filename)
    {
          runnable = () -> {
          FileInputStream fis = null;
         // current_music=filename;
             try {
                 fis = new FileInputStream("music\\"+filename+".mp3");
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

 threadmp3 = new Thread(runnable);
threadmp3.start();
        
    }
      
      
      void stopMusic()
      {
           
                
                
           if(threadmp3.isAlive())
             {
                 System.out.print("true");
                 try {
                     threadmp3.sleep(1000);
                 } catch (InterruptedException ex) {
                     Logger.getLogger(Music.class.getName()).log(Level.SEVERE, null, ex);
                 }
                threadmp3.stop();
               
             }
           
         
      }
      
      
      
      void afficher_liste_musique(JList list_musique)
    {
        String names[]=getMusicFiles();
        
               
          
        //create list 
       JList b= new JList(names); 
          
        //set a selected index 
        b.setSelectedIndex(0);
         
        
        list_musique.setListData(names);
        

    }
      
      void next()
      {   stopMusic();
           int index= getIndex(current_music);
           System.err.println(""+index);
           String[]  music_lists=getMusicFiles();
        
         if(index==music_lists.length)
            {index=0;
             playmp3(music_lists[index]);
            }
 current_music=music_lists[index+1];
  System.out.println("Music.next()"+current_music);
           playmp3(music_lists[index+1]);
          
           
          
      }
      
      void previous()
      {
          stopMusic();
           int index= getIndex(current_music);
           System.err.println(""+index);
           String[]  music_lists=getMusicFiles();
         
           if(index==0)
            {index=0;
               playmp3(music_lists[index]);
            }
           current_music=music_lists[index-1];
           System.out.println("Music.previous()"+current_music);
           playmp3(music_lists[index-1]);
            
      }
}
