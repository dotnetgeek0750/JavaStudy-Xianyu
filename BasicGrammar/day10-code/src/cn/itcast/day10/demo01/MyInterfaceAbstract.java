package cn.itcast.day10.demo01;


/**
 * 任何版本的Java中，接口都能定义抽象方法
 * <p>
 * 注意事项：
 * 1、接口当中的抽象方法，修饰符必须是两个固定的关键字 public abstract
 * 2、这两个关键字修饰符，可以选择性的省略，（今天刚学，所以不推荐省略。）
 */
public interface MyInterfaceAbstract {

    //抽象方法
    public abstract void methodAbs();

    //抽象方法
    abstract void methodAbs2();

    //抽象方法
    public void methodAbs3();

    //抽象方法
    void methodAbs4();
}
