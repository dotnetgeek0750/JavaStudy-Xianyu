package cn.itcast.day08.demo03;

/**
 * 静态代码块
 * <p>
 * 特点：当第一次用到本类时，静态代码块执行唯一的一次
 */
public class Person {

    static {
        System.out.println("静态代码块执行");
    }

    public Person() {
        System.out.println("构造函数执行");
    }
}
