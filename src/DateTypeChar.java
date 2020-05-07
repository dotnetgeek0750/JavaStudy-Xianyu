/**
 * ASCII码表：American Standard Code For Infomation Interchange 美国信息交换标准码表
 * Unicode码表：万国码，也是数字和符号对照关系表，开头0-127部分和ASCII一样，从128开始包含更多字符
 * <p>
 * 48 - '0'
 * 65 - 'A'
 * 97 - 'a'
 */
public class DateTypeChar {
    public static void main(String[] args) {

        char zifu = '1';
        System.out.println(zifu + 0); //49

        char zifu2 = 'A'; //底层的ASCII的数字
        System.out.println(zifu2 + 0); //65

        char zifu3 = 'c';
        int num = zifu3;
        //左侧是int类型，右边是char类型
        //char -》 int  从小到大发生自动类型转换。
        System.out.println(num);  //99

        char zifu4 = '中';
        System.out.println(zifu4 + 0); //20013，中文在ASCII表中找不到，但是会在Unicode码表中找、

    }
}
