public class FloatDetail{
    public static void  main(String[] args){
        //Java��������Ĭ��������double����
        float numb = 2.1F;
        double numb2 = 2.2;
        //������ʮ���Ʊ�ʾ��ʽ:2.12   .12�ȼ���0.12   2.12f(��ʾ������)
        double numb3 = .12;
        System.out.println(numb3);
        //��ѧ������: 12.2e3(12.2 * 10 ��3�η�)  12.2E-3��12.2*10��-3�η���
        double numb4 = 12.2e3;
        double numb5 = 12.2E-3;
        System.out.println(numb4);
        System.out.println(numb5);
        //һ�㲻֪�����徫��Ҫ��ʱ���Ƽ�ʹ��double��double�ľ��ȸ���
        
        
        //������ʹ�����壺����С��������õ���ȷ��ֵ�������С���Ƚϣ��Ƽ�����֮��ľ���ֵ��һ����Χ
        double numb6 = 0.7;
        double numb7 = 1.2 * 2;
        double numb8 = 2.1 / 3;
        System.out.println(numb6);
        System.out.println(numb8);
        if(numb6 == numb8){
            System.out.println("numb6==numb8�������");

        }
        if(Math.abs(numb6 - numb8) < 0.000001){
            System.out.println("numb6 - numb8��ֵС�ھ��ȷ�Χ�������");
        }
        
    }
}