
public class ArithmeticOperatorExercise01{
    public static void  main(String[] args){
        int i = 1;
        i = i++;
        // temp = i;1
        // i = i + 1;2
        // i = temp;1
        System.out.println(i);//1

        int j = 1;
        j = ++j;
        //j = j + 1;2
        //temp = j;2
        //j = temp;2
        System.out.println(j);//2
    }
}