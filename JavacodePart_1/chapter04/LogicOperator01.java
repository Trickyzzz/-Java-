//��ʾ�߼��������ʹ��
public class LogicOperator01{
    public static void  main(String[] args){
        //&& �� &
        int age = 50;
        if(age > 10 && age < 90){
            System.out.println("ok1");
        }
    //&
        if(age > 10 & age < 90){
            System.out.println("ok2");
        }

    //����&&�������һ������Ϊfalse������������������жϣ�Ч�ʸ���
        int num1 = 4;
        int num2 = 5;
    //&&��һ������Ϊfalse��������������жϣ�num2Ϊ5
        if(num1 > 5 && num2-- == 5){
            System.out.println("ok100");
        }
            System.out.println(num2);
    //&��һ������Ϊfalse���������������Ҫ���У�num2Ϊ4
          if(num1 > 5 & num2-- == 5){
            System.out.println("ok100");
        }
            System.out.println(num2);

    }
}
