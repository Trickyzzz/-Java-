public class BitOperator01{
    public static void main(String[] args){
       // >>�������ƣ������������ƶ�����λ���������λ���䣬�÷���λ�������λ
       // <<�������ƣ������������ƶ�����λ���������λ���䣬��λ��0
       // >>>�߼����ƣ��޷������ƣ���λ�������λ��0
       // ������<<<
        int a = 1 >> 2;// >> �ȼ۲���/2/2 00000001->00000000
        int b = -1 >> 7;// 11111111->-1 ����0
        int c = 1 << 2;// << �ȼ۲���*2*2
        int d = -1 << 2;//11111111-��11111100-��11111011-��10000100
        int e = 3 >>> 2;// 0 /2/2
        System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       System.out.println(e);
    }
}