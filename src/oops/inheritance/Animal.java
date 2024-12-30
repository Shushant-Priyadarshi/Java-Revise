package oops.inheritance;

public class Animal {
    String name;
    int legs;

    void noOflegs(){
        System.out.println(this.name+" has "+this.legs+" legs");
    }

    void eat(){
        System.out.println("Animal eats: ");
    }
}
