package chapter9;

public class Boxing {
    public static void main(String[] args) {
        int i =5;
        Integer iObj = new Integer(7);

        int sum = i + iObj; //iObj.intValue()
        System.out.println(sum);
    }
}
