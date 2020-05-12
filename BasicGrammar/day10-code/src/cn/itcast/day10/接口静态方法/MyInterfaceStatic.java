package cn.itcast.day10.接口静态方法;

/**
 * 定义接口静态方法
 * 格式：public static 返回值 方法名称
 */
public interface MyInterfaceStatic {

    public static void methodStatic() {
        System.out.println("这是接口的静态方法，不能通过对象调用");
    }
}
