import java.io.*;

/**
 * Created by eric on 4/5/16.
 */
public class FileStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fop = new FileOutputStream("text.txt");

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

        writer.append("中文输入");
        writer.append("\r\n");
        writer.append("English");
        writer.close();
        fop.close();

        FileInputStream fip = new FileInputStream("text.txt");

        InputStreamReader reader = new InputStreamReader(fip);
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();

//        try {
//            byte bWrite[] = {11, 22, 33, 40, 5};
//            OutputStream outputStream = new FileOutputStream("test.txt");
//            for (byte element:bWrite
//                 ) {
//                outputStream.write(element);
//            }
//            outputStream.close();
//
//            InputStream inputStream = new FileInputStream("test.txt");
//            int size = inputStream.available();
//
//            for (int i=0; i< size; i++) {
//                System.out.println((char)inputStream.read() + " ");
//            }
//            inputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
