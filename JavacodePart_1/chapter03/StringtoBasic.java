public class StringtoBasic{
    public static void  main(String[] args){

        int i1 = 987;
        float f1 = 2.2f;
        double d1= 3.45;
        boolean b1= true;
        //��������������ת��ΪString���ͣ�ֱ�ӱ���+""
        String s1 = i1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
    System.out.println("-----------------------------------------");
        //��String����ת��Ϊ�����������ͣ���Ҫʹ�û������Ͱ�װ�����parsexx����
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

        //��String����ת��Ϊchar���ͣ�û��ת�������Ǵ�String��ȡ����n����Ӧ���ַ�Ϊchar����
        System.out.println(s6.charAt(0));

    }
}