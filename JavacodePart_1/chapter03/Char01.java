public class Char01{
    public static void  main(String[] args){
    //字符类可以直接输入数字，会输出数字对应编码的内容
    char c1 = 97;
    System.out.println(c1);
    //字符型可以保存中文、转移字符、英文  char 是两个字节
    char c2 = '中';
    char c3 = '\t';
    char c4 = 's';
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    }
}