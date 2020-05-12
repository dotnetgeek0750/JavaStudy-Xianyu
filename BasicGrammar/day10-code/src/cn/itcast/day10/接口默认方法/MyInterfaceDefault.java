package cn.itcast.day10.接口默认方法;

/**
 * 接口定义了一个抽象方法、一个默认方法
 * 抽象方法：实现类必须实现
 * 默认方法：实现类可选择的实现
 */
public interface MyInterfaceDefault {

    public abstract void method();

    public default void methodDefault() {
        System.out.println("这是接口的默认方法");
    }
}
