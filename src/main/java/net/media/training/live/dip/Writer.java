package net.media.training.live.dip;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void writeToFile(String fileName, String toWrite){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(toWrite);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToDatabase(String toWrite){
        MyDatabase database = new MyDatabase();
        database.write(toWrite);
    }
}
