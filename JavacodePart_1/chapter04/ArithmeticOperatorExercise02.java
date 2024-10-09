
public class ArithmeticOperatorExercise02{
    public static void  main(String[] args){
        int days = 59;
        int week = days / 7;
        int day = days % 7;
        System.out.println("合"+week+"星期零"+day+"天");

        double Hc = 234.5;
        double C = 5.0 / 9 * (Hc - 100);
        System.out.println("摄氏温度为:"+C);    
    }
}