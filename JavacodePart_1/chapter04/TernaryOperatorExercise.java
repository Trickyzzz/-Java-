//三元运算符，表达式1和表达式2，需要是可以赋给变量的值，或者可以自动转换
public class TernaryOperatorExercise{
    public static void  main(String[] args){
        //实现三个数的最大值
        int a = 100;
        int b = 90;
        int c = 3;
        //思路：先比较两个数，取出较大的一个，再和第三个数比较，得出最大的数
        int Bigger = a > b ? a : b;
        int Max = Bigger > c ? Bigger : c ;
        System.out.println(Max);


    }
}

