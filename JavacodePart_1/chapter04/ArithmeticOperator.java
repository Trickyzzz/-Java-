/**
 *  ��ʾ�����������ʹ��
 */
public class ArithmeticOperator{
    public static void  main(String[] args){
        System.out.println(10/4);
        System.out.println(10.0/4);     //����ʱ��ת��Ϊdouble���ͣ��õ�2.5
        double d1 = 10/4;   //10/4������Ϊ2����2��Ϊdouble����
        System.out.println(d1);

        //ȡģ->ȡ��
        //ȡģ�ı��ʣ�A % B = A - (A / B) * B
        System.out.println(10 % 3 );//10 - (10 / 3) * 3 = 1
        System.out.println(10 % -3 );//10   10  -3   -3  = 1
        System.out.println(-10 % 3 );//-10  -10  3    3  = -1
        System.out.println(-10 % -3 );// -10  -10  -3  -3  = -1
    
        //++��ʹ��
        //������ʹ�ã�i++��++iû������
        int i = 0;
        i++;// i = i + 1;
        ++i;// i = i + 1;
    
        /*
         ��Ϊ���ʽʹ��
        ǰ++:++i ����������ֵ
        ��++:i++ �ȸ�ֵ��������
         */
        int n = 0;
        int m =n++;//n = 1, m = 0
        System.out.println("n=" + n +"," + "m=" + m);//n=1,m=0
        int j = ++n;// n = 2, j = 2
         System.out.println("n=" + n +"," + "j=" + j);//n=2,j=2
    }


}