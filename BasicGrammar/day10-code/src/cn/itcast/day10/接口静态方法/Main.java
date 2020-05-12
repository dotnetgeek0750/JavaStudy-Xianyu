package cn.itcast.day10.接口静态方法;

public class Main {

    public static void main(String[] args) {

        //创建对象
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        //错误：不能通过对象调用接口静态方法
        // impl.methodStatic();

        //正确：通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
