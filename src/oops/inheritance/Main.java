package oops.inheritance;


public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Animal a1 =  new Animal();
        d1.name = "Tubby";
        d1.legs =4;
        d1.noOflegs();
        d1.eat();
        a1.eat();
    }
}
