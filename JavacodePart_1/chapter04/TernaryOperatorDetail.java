//三元运算符，表达式1和表达式2，需要是可以赋给变量的值，或者可以自动转换
public class TernaryOperatorDetail{
    public static void  main(String[] args){
        double num1 = 10.2;
        double num2 = 1.3;
        double result = num1 > num2 ? --num1 : ++num2 ; //9.2
        // int result = num1 > num2 ? --num1 : ++num2 ;//类型不匹配
        System.out.println(result);
    }
}

