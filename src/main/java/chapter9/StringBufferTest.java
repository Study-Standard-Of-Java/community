package chapter9;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = sb.append("123");
        StringBuffer result = sb2.append("dd").append("CC");

        System.out.println("result = " + result);

    }
}
