public class FloatDetail{
    public static void  main(String[] args){
        //Java浮点数的默认类型是double类型
        float numb = 2.1F;
        double numb2 = 2.2;
        //浮点数十进制表示方式:2.12   .12等价于0.12   2.12f(表示单精度)
        double numb3 = .12;
        System.out.println(numb3);
        //科学计数法: 12.2e3(12.2 * 10 的3次方)  12.2E-3（12.2*10的-3次方）
        double numb4 = 12.2e3;
        double numb5 = 12.2E-3;
        System.out.println(numb4);
        System.out.println(numb5);
        //一般不知道具体精度要求时，推荐使用double，double的精度更高
        
        
        //浮点数使用陷阱：计算小数，不会得到精确的值，因此做小数比较，推荐两数之差的绝对值在一个范围
        double numb6 = 0.7;
        double numb7 = 1.2 * 2;
        double numb8 = 2.1 / 3;
        System.out.println(numb6);
        System.out.println(numb8);
        if(numb6 == numb8){
            System.out.println("numb6==numb8两数相等");

        }
        if(Math.abs(numb6 - numb8) < 0.000001){
            System.out.println("numb6 - numb8差值小于精度范围，可相等");
        }
        
    }
}