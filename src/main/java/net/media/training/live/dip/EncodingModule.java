package net.media.training.live.dip;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

/**
 * Reader class and writer class.
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {
    public void encodeWithFiles() {
        Reader reader = new Reader();
        Writer writer = new Writer();
        String readFilePath = "/Users/skyywalker/Downloads/SolidLiveAsignment-master/src/main/java/net/media/training/live/dip/afterEncryption.txt";
        String writeFilePath = "/Users/skyywalker/Downloads/SolidLiveAsignment-master/src/main/java/net/media/training/live/dip/afterEncryption.txt";
        String content = reader.readFromFile(readFilePath);
        writer.writeToFile(writeFilePath, content);
    }

    public void encodeBasedOnNetworkAndDatabase() {
        URL url = null;
        try {
            url = new URL("http", "myfirstappwith.appspot.com", "index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Reader reader = new Reader();
        Writer writer = new Writer();
        String content = reader.readFromDatabase(url);
        String encodedString = Base64.getEncoder().encodeToString(content.getBytes());
        writer.writeToDatabase(encodedString);
    }
}

