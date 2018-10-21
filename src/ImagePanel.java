/*
la classe Image Panel permet de dessiner les images dans un panel 
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


class ImagePanel extends JPanel {

  
  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
   
    //parametrage de JPanel
    Dimension size = new Dimension(250, 250);
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

  //dessiner l'image 
  public void paintComponent(Graphics g) {
    
    g.drawImage(getImg(), 0, 0, null);
    repaint();
  }

  
    public Image getImg() {
        return img;
    }

}