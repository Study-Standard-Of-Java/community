package chapter5;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String[] name = new String[3];
        name[0] = new String("Kim");
        name[1] = new String("Park");
        name[2] = "Kim";

        String[] name1 = new String[3];
        name1[0] = "Kim";
        name1[1] = "Park";

        System.out.println(name[0] == name1[0]); //false
        System.out.println(name[0] == name[2]); //false


    }
}
