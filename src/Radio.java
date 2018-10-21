/*
 * la classe Radio permet d'assuser la lecture de radio streaming 
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Radio {

    public static Thread lectureradio_thread;
    public static Runnable runnable;
    private String url = null;

    public Radio() {
    }

    //permet de gerer et lecture les flux 
    private static void playRadioStream(String spec) throws IOException, JavaLayerException {
        URLConnection urlConnection = new URL(spec).openConnection();
        urlConnection.connect();
        Player player = new Player(urlConnection.getInputStream());
        player.play();
    }

//permet la lecture de radio
    void lectureRadio(int n) {
        runnable = () -> {
            FileInputStream fis = null;

            if (n == 1) {
                url = "http://radio.flex.ru:8000/radionami";
            }
            if (n == 2) {
                url = "http://streaming.radio.funradio.fr/fun-1-44-128";
            }
            try {
                playRadioStream(url);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }

        };
        lectureradio_thread = new Thread(runnable);
        lectureradio_thread.start();
    }

//arrete rde lradio streaming     
    void arreterRadio() {
        if (lectureradio_thread.isAlive()) {

            try {
                lectureradio_thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Music.class.getName()).log(Level.SEVERE, null, ex);
            }
            lectureradio_thread.stop();

        }
    }

    public String getUrl() {
        return url;
    }

}
