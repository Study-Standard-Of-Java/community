package chapter9.objects;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < 10000000; i++) {
            int num = random.nextInt(10);
            System.out.println(num);
            if (num <= 4) {
                count1++;
            }else{
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
