package CheckConnection;

import java.net.URL;
import java.net.URLConnection;

public class Check {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.google.com/");
            URLConnection connection = url.openConnection();
            connection.connect();

            System.out.println("Your Internet is working");
        } catch (Exception e) {
            System.out.println("Checking Connection");
        }
    }
}