package org.example;


class cake {
    public void yummy() {
        System.out.println("Cake yummy");
    }
}
class ACake extends Cake {
    public void yummy() {
        System.out.println("ACake yummy");
    }
    class BCake extends ACake{
        public void yummy(){
            super.yummy();
            System.out.println("BCake yummy");
        }
}
public class Main4 {

    Cake cb = new BCake();
    Cake ca = new ACake();
        cb.yummy();
        ca.yummy();
  }

}
