package oops.basics;


public class Student {
     String name;
     int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }
    public  Student(){

    }

    public void  getInfo(){
        System.out.println(this.name+" is "+this.age+" years old");
    }
}

