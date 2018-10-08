package _Experiments_._Dumped_;
import javax.swing.JFileChooser;
import java.io.File;
public class Main {
    public static void main(String s[]) {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File(""));//Set pwd
        chooser.setDialogTitle("choosertitle");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.showOpenDialog(null);//Show the dialog
        File selectedFile=chooser.getSelectedFile();
        System.out.println(selectedFile);
    }
}
