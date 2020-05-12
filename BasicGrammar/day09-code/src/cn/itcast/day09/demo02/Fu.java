package cn.itcast.day09.demo02;

public class Fu {
    int numFu = 10;
    int num = 100;
    public void methodFu() {
        //这个方法是在父类定义的，因此使用父类的num变量
        System.out.println(num);
    }
}
