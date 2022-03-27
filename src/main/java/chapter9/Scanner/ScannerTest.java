package chapter9.Scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("0 입력시 프로그램 종료");

        while(true){
            System.out.print(">>");
            String input = sc.nextLine();
            if (input.equals("0")) {
                System.out.println("입력 종료중..");
                break;
            }
            String checked = input + " 체크 완료";

            System.out.println("checked = " + checked);
        }
        System.out.println("프로그램 종료");
    }
}
