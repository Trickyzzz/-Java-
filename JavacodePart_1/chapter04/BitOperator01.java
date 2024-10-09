public class BitOperator01{
    public static void main(String[] args){
       // >>算数右移，将补码向右移动，低位溢出，符号位不变，用符号位补溢出高位
       // <<算数左移，将补码向左移动，高位溢出，符号位不变，低位补0
       // >>>逻辑右移，无符号右移，低位溢出，高位补0
       // 不存在<<<
        int a = 1 >> 2;// >> 等价补码/2/2 00000001->00000000
        int b = -1 >> 7;// 11111111->-1 还是0
        int c = 1 << 2;// << 等价补码*2*2
        int d = -1 << 2;//11111111-》11111100-》11111011-》10000100
        int e = 3 >>> 2;// 0 /2/2
        System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       System.out.println(e);
    }
}