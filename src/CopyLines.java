import java.io.*;

/**
 * Created by eric on 3/11/16.
 */
public class CopyLines {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("test.txt"));
            printWriter = new PrintWriter(new FileWriter("testTo.txt"));

            String l;
            while ((l = bufferedReader.readLine()) !=null) {
                printWriter.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(bufferedReader != null) {
                bufferedReader.close();
            }
            if(printWriter != null) {
                printWriter.close();
            }
        }
    }
}
