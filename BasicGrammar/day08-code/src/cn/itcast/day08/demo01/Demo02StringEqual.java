package cn.itcast.day08.demo01;

public class Demo02StringEqual {

    /**
     * ==是进行对象的地址值比较，
     * 如果进行字符串内容比较，可以使用两个方法
     * 一、 equal(Object obj)
     * 注意事项：
     * 1、参数是Object类型
     * 2、equals方法具有对称性，也就是a.equals(b) 和 b.equals(c)效果一样
     * 3、推荐 "abc".equals(str)，而不是 str.equals("abc")
     * <p>
     * <p>
     * 二、equalsIgnoreCase 忽略大小写
     *
     * @param args
     */
    public static void main(String[] args) {

        //equals
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray); //new会不适用字符串常量池

        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3));//true
        System.out.println(str2.equals(str3));//true

        //推荐写法
        String str5 = null;
        System.out.println("abc".equals(str5));//推荐：false
        System.out.println(str5.equals("abc"));//不推荐：空指针异常

        //equalsIgnoreCase
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));//false
        System.out.println(strA.equalsIgnoreCase(strB));//true
    }
}
