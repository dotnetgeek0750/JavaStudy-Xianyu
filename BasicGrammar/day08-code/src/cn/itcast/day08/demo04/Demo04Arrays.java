package src.cn.itcast.day08.demo04;

import java.util.Arrays;

/**
 * java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作
 * public static String toString() 将数组参数变成字符串
 * public static void sort() 按照默认升序对数组进行排序
 */
public class Demo04Arrays {
    public static void main(String[] args) {

        int[] intArrays = {20, 10, 30};
        String intStr = Arrays.toString(intArrays);
        System.out.println(intStr); //[20, 10, 30]

        Arrays.sort(intArrays);
        System.out.println(Arrays.toString(intArrays));//[10, 20, 30]

        String[] array2 = {"bbb", "aaa", "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));//[aaa, bbb, ccc]
    }
}
