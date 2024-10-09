//
public class InverseOperator{
    public static void  main(String[] args){
        System.out.println(10 > 1);
        System.out.println(!(10 > 1));
        //^逻辑异或，两侧相同为false，两侧不同为true 
        boolean b = (3 > 2) ^ (2 > 1);
        System.out.println(b);
        boolean b1 = (3 > 2) ^ (2 < 1);
        System.out.println(b1);


    }
}

//1.x=6,y=6
//2.x=6,y=5
//3.x=11,y=6
//4.x=11,y=5
//5.z 50