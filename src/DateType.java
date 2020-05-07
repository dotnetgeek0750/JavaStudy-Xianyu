/**
 * 强制类型转换
 * 1、特点：代码需要进行特殊的格式处理，不能自动完成
 * 2、格式：范围小的类型 范围小的变量名 = （范围小的类型）原本范围大的数据。
 *
 * 注意：
 * 1、强制类型转换一般不推荐使用，因为可能发生精度损失，数据溢出。
 * 2、byte/short/char 这三种类型都可以发生数学运算，例如加法 +
 * 3、byte/short/char  这三种类型在运算的时候，都会首先提升为int类型，然后再计算
 * 4、Boolean 类型不能发生数据类型转换
 */
public class DateType {
    public static void main(String[] args) {

        //强制类型转换
        {
            //左边是int，右边是long，不一样，long比int大，不能自动类型转换
            int num = (int) 100L;
            System.out.println(num); //100

            //long强制转换成int类型，洒了，精度丢失
            int num2 = (int) 6000000000L;
            System.out.println(num2); //1705032704

            //double -> int 强制类型转换
            int num3 = (int) 3.99;
            System.out.println(num3); //3 ，这不是四舍五入，所有小数位都舍弃掉

            //char 字符也可以转成数字
            char zifu1 = 'A';
            System.out.println(zifu1 + 1); //66


            //byte + byte = int  会自动提升为int类型。
            byte num4 = 40;
            byte num5 = 50;
            int result = num4 + num5; //如果使用 byte result 来接受会运行报错。
            System.out.println(result); //90


            //byte + short =int，但可以在不超过范围的前提下强制类型转换
            short num6 = 60;
            short result2 = (short) (num4 + num6);
            System.out.println(result2); //100
        }


    }

}
