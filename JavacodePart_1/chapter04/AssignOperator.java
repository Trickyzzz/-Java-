//
public class AssignOperator{
    public static void  main(String[] args){
        // 复合赋值运算符:
        // +=,-=,/=,%=...
        //复合赋值运算符有一个类型转换

        byte b = 2;
        // b = b + 2;
        //b+2会自动变为int类型，而byte类型无法接受int，byte占2字节，int占4字节
        //这里有强制类型转换b = (byte)(b+2);
        b += 2;

    }
}

