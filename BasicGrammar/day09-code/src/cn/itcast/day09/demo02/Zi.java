package cn.itcast.day09.demo02;

public class Zi extends Fu {
    int numZi = 20;
    int num = 200;
    public void methodZi() {
        //这个方法是子类的，优先使用子类，没有再向上找。
        System.out.println(num);
    }
}
