//��Ԫ����������ʽ1�ͱ��ʽ2����Ҫ�ǿ��Ը���������ֵ�����߿����Զ�ת��
public class TernaryOperatorExercise{
    public static void  main(String[] args){
        //ʵ�������������ֵ
        int a = 100;
        int b = 90;
        int c = 3;
        //˼·���ȱȽ���������ȡ���ϴ��һ�����ٺ͵��������Ƚϣ��ó�������
        int Bigger = a > b ? a : b;
        int Max = Bigger > c ? Bigger : c ;
        System.out.println(Max);


    }
}

