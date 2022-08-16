package chapter12;

import java.util.ArrayList;
import java.util.List;

class Father{
    public String toString(){
        return "Father";
    }
}
class Child extends Father{
    @Override
    public String toString() {
        return "Child";
    }
}
public class SafeVarargsEx {
    static <T> ArrayList<T> addadd(ArrayList<? extends T>... lists) {
        ArrayList<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }
        return result;
    }
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Father> fArray = new ArrayList<Father>();
        fArray.add(new Father());
        fArray.add(new Father());
        ArrayList<Child> cArray = new ArrayList<>();
        cArray.add(new Child());
        cArray.add(new Child());
        ArrayList<Father> totalArray = addadd(fArray,cArray);
        Thread.sleep(100000);
        for(Father e : totalArray){
            System.out.println(e);
        }

    }
}