package chapter11.collectionuse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("입력하세요 stop 입력시 종료");
            String s = sc.nextLine();
            if (s.equals("stop")) {
                break;
            }
            list.add(s);
        }
        for (String s : list) {
            System.out.println("꺼내진 요소들 = " + s);
        }
        if (list.size() > 2) {
            list.remove(0);
        }
        System.out.println("list.get(0) = " + list.get(0));
        Collections.sort(list);
        for (String s : list) {
            System.out.println("s = " + s);
        }
    }

}
