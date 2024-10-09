char->int->long->float->double
byte->short->int->long->float->double

//1.当程序运行时，自动将所有数据转换成容量最大的数据类型：
    int num = 1；
    double = num + 1.1；
// 2.(byte,short)和char不能够相互转换
// 3.byte，short，char三者之间进行运算时，会在运算之前转换为int类型
short num1 = 1;
byte num2  = 2;
byte b1 = 3;
short num3 = num1 + num2; //错误，num1 + num2 为int,不能变为short
byte num4 = b1 + num2;//错误，同上
//boolean 

强制类型转换:将数据类型从大->小
//1.造成精度损失
int i = (int)1.9;
//2.造成数据溢出overflow
int i2 = 2000
byte b3 = (byte)i2;
Detail:

1.当将数据从大->小时，使用强制转换
2.强制转换只对最近的操作数有效,可以使用小括号提高优先级
int num = (int)10 + 8.8 * 2 + 9.2;//错误
int num = (int)(10 + 8.8 * 2 + 9.2);//正确
3.char类型可以保存int常量，不能保存int变量，需要先将变量类型int强制转换为char
char c1 = 100;//正确
int n1 = 100;//正确
char = n1;//错误
char = (char)n1;//true