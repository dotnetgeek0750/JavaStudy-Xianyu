package cn.itcast.day08.demo03;

public class Student {

    private String name;
    private int age;
    private int id;//学号

    static String room; //所在教室
    static int idCounter = 0;


    public Student() {
        this.id = ++this.idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++this.idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
