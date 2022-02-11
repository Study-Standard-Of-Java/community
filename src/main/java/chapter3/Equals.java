package chapter3;

public class Equals {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = new String("abc");
        String str3 = "ABC";
        if (str.equals(str2)) {
            System.out.println("같은 값입니다");
        }
        if (str == str2) {
            System.out.println("같은 객체를 가리킨다.");
        }else{
            System.out.println("다른 객체를 가리킨다.");
        }
        if (str.equalsIgnoreCase(str3)) {
            System.out.println("대소문자 상관없이 동일");
        }
    }
}
