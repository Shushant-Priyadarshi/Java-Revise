package oops.basics;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Shushant",19);
        Student s2 = new Student("Prisha",23);
        s1.getInfo();
        s2.getInfo();

        Student s3 = new Student();
        s3.name = "Shivam";
        s3.age = 20;
        s3.getInfo();

        Student s4 = new Student(18,"Rajneet");
        s4.getInfo();
    }
}
