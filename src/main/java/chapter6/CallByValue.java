package chapter6;

class Call{
    int x;
}

public class CallByValue {
    public static void main(String[] args) {
        Call call = new Call();
        call.x=10;
        System.out.println("call.x = " + call.x);

        change(call.x);

        System.out.println("call.x = " + call.x);

        change2(call);
        System.out.println("call.x = " + call.x);
    }

    static void change(int x) {
        x=100;
        System.out.println("x = " + x);
    }
    static void change2(Call c) {
        c.x=100;
        System.out.println("c.x = " + c.x);
    }
}
