package chapter7;

import java.util.ArrayList;

class FireEngine extends Car {
    void water() {
        System.out.println("water");
    }
}

class Ambulance extends Car {
    void siren() {
        System.out.println("siren");
    }
}
public class Car {
   String color;
   int door;
   void drvie() {
       System.out.println("drive");
       ArrayList<Object> objects = new ArrayList<>();
   }
}
