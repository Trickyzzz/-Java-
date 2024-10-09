public class CharDetail{
    public static void  main(String[] args){
        //字符类型char，使用单引号引起要保存的内容
        //  \是转义字符
        //字符类型的本质是整数，当直接输出字符时，相当于直接输出数字在编码表上对应的内容
        char c1 = 97;
        char c2 = 98;
        char c3 = 99;
        //char能保存单个字符，如果存99则需要用string
        char c4 = '9';
        System.out.println(c1 + c2 + c3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println((int)c1);
    }
}