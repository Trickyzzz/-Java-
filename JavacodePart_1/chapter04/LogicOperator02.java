//演示逻辑运算符的使用
public class LogicOperator02{
    public static void  main(String[] args){
                //|| 和 |
        int age = 50;
        if(age > 10 || age < 90){
            System.out.println("ok1");
        }
    //&
        if(age > 10 | age < 90){
            System.out.println("ok2");
        }

    //区别||：如果第一个条件为true，后面的条件不进行判断，效率更高
        int num1 = 4;
        int num2 = 5;
    //||第一个条件为true，后面的条件不判断,num2为5
        if(num1 > 3 || num2-- == 5){
            System.out.println("ok100");
        }
            System.out.println(num2);
    //|第一个条件为true，后面的条件还是要进行，num2为4
          if(num1 > 5 | num2-- == 5){
            System.out.println("ok100");
        }
            System.out.println(num2);

    }
}