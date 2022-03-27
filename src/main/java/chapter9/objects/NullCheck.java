package chapter9.objects;

import java.util.Objects;

public class NullCheck {

    private String name;

    public void setName(String name) {
        this.name = Objects.requireNonNull(name, "널 포인터 예외 발생 ");
    }

    public static void main(String[] args) {
        Integer num = null;
        System.out.println("Objects.isNull(num) = " + Objects.isNull(num));

        NullCheck nullCheck = new NullCheck();
        nullCheck.setName("Keun Young");
        nullCheck.setName(null); //예외 발생
    }
}
