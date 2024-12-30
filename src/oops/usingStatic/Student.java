package oops.usingStatic;

public class Student {
    private Integer id;
    private String name;
    private Integer age;

    private  static  int counter = 0;

    public Student() {
        counter++;
    }

    public  static void countStudent() {
        System.out.println("Total Students : " + counter);
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
