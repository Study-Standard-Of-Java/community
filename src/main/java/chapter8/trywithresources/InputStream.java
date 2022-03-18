package chapter8.trywithresources;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        DataInputStream dis = null;
        try {
            FileInputStream fis = new FileInputStream("score.dat");
            dis = new DataInputStream(fis);
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
