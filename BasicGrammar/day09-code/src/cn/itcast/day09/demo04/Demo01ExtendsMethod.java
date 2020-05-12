package cn.itcast.day09.demo04;

public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        //创建的是new了子类对象，所以优先使用子类方法
        zi.method();  //子类
    }
}
