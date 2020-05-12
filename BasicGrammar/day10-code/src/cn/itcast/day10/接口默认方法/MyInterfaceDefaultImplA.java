package cn.itcast.day10.接口默认方法;

/**
 * 接口MyInterfaceDefault的实现类
 * method是接口的抽象方法，必须实现
 * methodDefault是接口的默认方法，可选择性实现
 */
public class MyInterfaceDefaultImplA implements MyInterfaceDefault {
    @Override
    public void method() {

    }

    @Override
    public void methodDefault() {
        System.out.println("这是实现类的默认方法");
    }
}
