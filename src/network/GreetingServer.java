package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Created by eric on 4/7/16.
 */
public class GreetingServer extends Thread{
    private ServerSocket serverSocket;

    public GreetingServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    public void run() {
        while (true) {

            try {
                System.out.println("waiting for client on port " +
                        serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("Just connect to " +
                        server.getRemoteSocketAddress() );
                DataInputStream dataInputStream = new DataInputStream(server.getInputStream());
                System.out.println(dataInputStream.readUTF());
                DataOutputStream outputStream = new DataOutputStream(server.getOutputStream());
                outputStream.writeUTF("Thank you for connecting to " +
                        server.getLocalSocketAddress() + "\nGoodBye");
                server.close();
            } catch (SocketTimeoutException s) {
                System.out.println("time out!");
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        try {
            Thread t = new GreetingServer(port);
            t.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
