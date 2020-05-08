package src.cn.itcast.day08.demo04;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo04MathPractise {

    public static void main(String[] args) {

        var start = -11;
        var end = 6;
        var arrInt = new ArrayList<>();
        for (int i = start; i < end; i++) {
            var abs = Math.abs(i);
            if (i > -10.8 && i < 5.9 && (abs > 6 || abs < 2.1)) {
                arrInt.add(i);
            }
        }
        System.out.println(arrInt);
    }
}
