package chapter15;

import java.io.*;
import java.util.ArrayList;

public class SerialEx1 {
    public static void main(String[] args) {
        try {
            String fileName = "UserInfo.ser";
            FileOutputStream     fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            ObjectOutputStream out = new ObjectOutputStream(bos);

            UserInfo u1 = new UserInfo("JavaMan","1234",30);
            UserInfo u2 = new UserInfo("JavaWoman","4321",26);

            ArrayList<UserInfo> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);

            // ��ü�� ����ȭ�Ѵ�.
            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            out.close();
            System.out.println("직렬화 성공");
        } catch(IOException e) {
            e.printStackTrace();
        }
    } // main
} // class
