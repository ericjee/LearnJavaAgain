import java.io.File;

/**
 * Created by eric on 4/5/16.
 */
public class DirList {
    public static void main(String[] args) {
        String dirName = "/tmp";
        File file = new File(dirName);
        if (file.isDirectory()) {
            System.out.println("Directory of " + dirName);
            String s[] = file.list();
            for (String element:s
                 ) {
                File secondFile = new File(dirName + "/" + element);
                if(secondFile.isDirectory()) {
                    System.out.println(element + " is a directory");
                } else {
                    System.out.println(element + " is a file");
                }
            }
        } else {
            System.out.println(dirName + " is not a directory");
        }
    }
}
