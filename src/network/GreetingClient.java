package network;

import java.io.*;
import java.net.Socket;

/**
 * Created by eric on 4/7/16.
 */
public class GreetingClient {
    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);

        try {
            Socket client = new Socket(serverName, port);
            System.out.println("Just connect to: " + client.getRemoteSocketAddress());
            OutputStream outputStream = client.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Hello from " + client.getLocalSocketAddress() );

            InputStream inputFromServer = client.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputFromServer);
            System.out.println("Server says " + dataInputStream.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
