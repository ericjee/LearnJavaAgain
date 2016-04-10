package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by eric on 4/7/16.
 */
public class URLConnDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.amrood.com");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = null;
            if (urlConnection instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) urlConnection;
            } else {
                System.out.println("please enter an HTTP URL.");
                return;
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String urlString = "";
            String current;
            while ((current = in.readLine()) != null) {
                urlString += current;
            }
            System.out.println(urlString);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
