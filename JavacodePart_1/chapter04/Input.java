//使用scanner和用户动态交互，接受来自键盘的输入
//首先导入包，才能使用类，使用类要new一个对象
import java.util.Scanner;

public class Input{
    public static void  main(String[] args){
        //要求编写程序，接受姓名，年龄，薪水
        //首先创建一个对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = myScanner.next();
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        System.out.println("请输入薪水");
        double salary = myScanner.nextDouble();
        System.out.println("姓名:" + name + " 年龄:" + age + " 薪水:" + salary);
    }
}

