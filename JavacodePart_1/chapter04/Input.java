//ʹ��scanner���û���̬�������������Լ��̵�����
//���ȵ����������ʹ���࣬ʹ����Ҫnewһ������
import java.util.Scanner;

public class Input{
    public static void  main(String[] args){
        //Ҫ���д���򣬽������������䣬нˮ
        //���ȴ���һ������
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������������");
        String name = myScanner.next();
        System.out.println("����������");
        int age = myScanner.nextInt();
        System.out.println("������нˮ");
        double salary = myScanner.nextDouble();
        System.out.println("����:" + name + " ����:" + age + " нˮ:" + salary);
    }
}

