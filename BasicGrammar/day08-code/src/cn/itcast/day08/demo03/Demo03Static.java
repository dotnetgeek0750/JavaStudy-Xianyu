package cn.itcast.day08.demo03;

/**
 * 静态代码块
 * <p>
 * 特点：当第一次用到本类时，静态代码块执行唯一的一次
 * <p>
 * 用途：
 * 用来一次性的对静态成员变量进行赋值
 */
public class Demo03Static {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
    }
}
