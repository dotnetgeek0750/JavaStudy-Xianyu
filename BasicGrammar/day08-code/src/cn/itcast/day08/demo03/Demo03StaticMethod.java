package cn.itcast.day08.demo03;

/**
 * 一旦使用了static修饰成员方法，那么就成为了静态方法，静态方法不属于对象，而是属于类
 * <p>
 * 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
 * 如果有了static关键字，那么不需要创建对象来调用
 * <p>
 * 无论是成员变量，还是成员方法，如果有了static，推荐使用类名称进行调用
 * 静态变量= 类名称.静态变量
 * 静态方法= 类名称.静态方法
 * <p>
 * 注意事项：
 * 1、静态不能访问非静态
 * 原因：在内存当中，是【先】有静态内容，【后】有非静态内容
 * 2、静态方法中，不能用this
 * 原因：this代表当前对象。
 */
public class Demo03StaticMethod {

    public static void main(String[] args) {

        //成员方法，需要创建对象来调用
        MyClass myClass = new MyClass();
        myClass.method();

        //静态方法，推荐类名称来调用
        MyClass.staticMethod();

    }
}
