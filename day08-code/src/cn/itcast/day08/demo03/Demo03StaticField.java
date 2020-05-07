package cn.itcast.day08.demo03;

/**
 * 如果一个成员变量使用了static关键字，
 * 那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享同一份数据
 */
public class Demo03StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖", 20);
        one.room = "101教室";
        Student two = new Student("黄蓉", 18);

        System.out.println(String.format("姓名：%s，年龄：%s，教室：%s，学号：%s", one.getName(), one.getAge(), one.room, one.getId()));
        System.out.println(String.format("姓名：%s，年龄：%s，教室：%s，学号：%s", two.getName(), two.getAge(), two.room, two.getId()));

        //姓名：郭靖，年龄：20，教室：101教室，学号：1
        //姓名：黄蓉，年龄：18，教室：101教室，学号：2
    }
}
