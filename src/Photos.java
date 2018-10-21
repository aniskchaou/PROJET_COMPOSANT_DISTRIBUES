
import java.io.File;
import javax.swing.JList;

/*
 *la classe photos permet de lister tous les images dans la repertoire images et les affichier
 */
public class Photos {

    private File folder;
    private String names[];

    public Photos() {
    }

//lister les images dans le dossier images
    String[] getImages() {
        folder = new File("images");
        File[] listOfFiles = folder.listFiles();
        names = new String[listOfFiles.length];
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                names[i] = listOfFiles[i].getName();
            } else if (listOfFiles[i].isDirectory()) {
            }
        }
        return names;
    }

    //afficher la liste des images       
    void afficher_liste_images(JList list_image) {
        String names[] = getImages();
        list_image.setListData(names);

    }
   
    //getters
    public File getFolder() {
        return folder;
    }

    public String[] getNames() {
        return names;
    }

}
