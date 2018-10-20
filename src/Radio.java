


import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Radio {
      public static Thread threadmp3;
    public static Runnable runnable ;
         private static void playRadioStream ( String spec ) throws IOException, JavaLayerException
    {
        // Connection
        URLConnection urlConnection = new URL ( spec ).openConnection ();

        // If you have proxy
        //        Properties systemSettings = System.getProperties ();
        //        systemSettings.put ( "proxySet", true );
        //        systemSettings.put ( "http.proxyHost", "host" );
        //        systemSettings.put ( "http.proxyPort", "port" );
        // If you have proxy auth
        //        BASE64Encoder encoder = new BASE64Encoder ();
        //        String encoded = encoder.encode ( ( "login:pass" ).getBytes () );
        //        urlConnection.setRequestProperty ( "Proxy-Authorization", "Basic " + encoded );

        // Connecting
        urlConnection.connect ();

        // Playing
        Player player = new Player ( urlConnection.getInputStream () );
        player.play ();
    }
    
     void play_radio(int n)
    {
          runnable = () -> {
          FileInputStream fis = null;
        String url=null;
        if(n==1)
         url="http://radio.flex.ru:8000/radionami";
                      try
        {
            playRadioStream ( url);
        }
        catch ( IOException e )
        {
            e.printStackTrace ();
        }
        catch ( JavaLayerException e )
        {
            e.printStackTrace ();
        }
        
    
                  };
      threadmp3 = new Thread(runnable);
threadmp3.start();
}
     
     void stop()
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
}
