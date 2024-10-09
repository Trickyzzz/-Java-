public class StringtoBasic{
    public static void  main(String[] args){

        int i1 = 987;
        float f1 = 2.2f;
        double d1= 3.45;
        boolean b1= true;
        //将基本数据类型转换为String类型，直接变量+""
        String s1 = i1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
    System.out.println("-----------------------------------------");
        //将String类型转换为基本数据类型，需要使用基本类型包装类里的parsexx方法
        String s5 = "100";
        short num1 = Short.parseShort(s5);
        int num2 = Integer.parseInt(s5);
        float num3 = Float.parseFloat(s5);
        double num4 = Double.parseDouble(s5);
        byte num5 = Byte.parseByte(s5);
        
        String s6 = "true";
        boolean b = Boolean.parseBoolean(s6);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(b);

        //将String类型转换为char类型，没有转换，而是从String中取到第n个相应的字符为char类型
        System.out.println(s6.charAt(0));

    }
}