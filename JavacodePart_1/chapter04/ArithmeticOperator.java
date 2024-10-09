/**
 *  演示算数运算符的使用
 */
public class ArithmeticOperator{
    public static void  main(String[] args){
        System.out.println(10/4);
        System.out.println(10.0/4);     //计算时先转变为double类型，得到2.5
        double d1 = 10/4;   //10/4计算结果为2，将2变为double类型
        System.out.println(d1);

        //取模->取余
        //取模的本质，A % B = A - (A / B) * B
        System.out.println(10 % 3 );//10 - (10 / 3) * 3 = 1
        System.out.println(10 % -3 );//10   10  -3   -3  = 1
        System.out.println(-10 % 3 );//-10  -10  3    3  = -1
        System.out.println(-10 % -3 );// -10  -10  -3  -3  = -1
    
        //++的使用
        //若单独使用，i++和++i没有区别
        int i = 0;
        i++;// i = i + 1;
        ++i;// i = i + 1;
    
        /*
         作为表达式使用
        前++:++i 先自增，后赋值
        后++:i++ 先赋值，后自增
         */
        int n = 0;
        int m =n++;//n = 1, m = 0
        System.out.println("n=" + n +"," + "m=" + m);//n=1,m=0
        int j = ++n;// n = 2, j = 2
         System.out.println("n=" + n +"," + "j=" + j);//n=2,j=2
    }


}