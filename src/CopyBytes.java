import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by eric on 3/11/16.
 */
public class CopyBytes {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("resources/xanadu.txt");
            fileOutputStream = new FileOutputStream("resource/outagain.txt");
            int c;

            while ((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream !=null) {
                fileOutputStream.close();
            }
        }
    }
}
