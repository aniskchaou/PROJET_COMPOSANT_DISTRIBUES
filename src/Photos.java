
import java.io.File;
import javax.swing.JList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Photos {
    
    
    
        String[] getImagesFiles()
    {
                File folder = new File("images");
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
        
        
        
          void afficher_liste_images(JList list_image)
    {
        String names[]=getImagesFiles();
        
               
       
       // b.setSelectedIndex(0);
         
        
        list_image.setListData(names);
        

    }
}
