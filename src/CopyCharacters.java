import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by eric on 3/11/16.
 */
public class CopyCharacters {
    public static void main(String[] args) throws IOException{
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("test.txt");
            fileWriter = new FileWriter("testTo.txt");
            int c;

            while ((c = fileReader.read()) != -1) {
                fileWriter.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if(fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
