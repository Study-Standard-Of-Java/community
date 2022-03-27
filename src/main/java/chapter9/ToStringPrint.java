package chapter9;

class Name{
    public String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ToStringPrint {
    public static void main(String[] args) {
        Name name1 = new Name("toString1");
        Name name2 = new Name("toString2");

        String s1 = "change";

        System.out.println("name1.toString() = " + name1.toString());
        System.out.println("name2.toString() = " + name2.toString());

        System.out.println("s1.toString() = " + s1.toString());
    }
}
