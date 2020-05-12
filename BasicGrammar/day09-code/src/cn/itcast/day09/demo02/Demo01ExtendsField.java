package cn.itcast.day09.demo02;

/**
 * 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：
 * <p>
 * 一、直接通过子类对象访问成员变量
 * 等号左边是谁，就优先用谁，没有则向上找。
 * <p>
 * 二、间接通过成员方法访问成员变量
 * 该方法属于谁，就优先使用谁，没有则向上找。
 */
public class Demo01ExtendsField {

    public static void main(String[] args) {

        Fu fu = new Fu(); //创建父类对象
        System.out.println(fu.numFu); //10。只能用父类的东西

        System.out.println("==============");

        Zi zi = new Zi();
        System.out.println(zi.numFu); //父类的值：10
        System.out.println(zi.numZi); //子类的值：20

        System.out.println("==============");

        //等号左边是子类，访问同名成员变量，则优先用子类
        System.out.println(zi.num);  //200

        System.out.println("==============");

        //这个方法是子类的，优先使用子类，没有再向上找。
        zi.methodZi(); //200
        //这个方法是在父类定义的，因此使用父类的num变量
        zi.methodFu();//100

    }
}
