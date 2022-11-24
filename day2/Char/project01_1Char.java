public class project01_1Char
{
	public static void main(String[] args){
		//char值的几种表示方式
		//1.单引号字符常量 
		char a = 'a';
		//2.字符转义序列
		char b = '\n';//共有八个预定义转义序列,不能自定义 转义序列以\开始 
		//char c = '\a'; //Err未知转义序列
		//3.Unicode
		//字符表示形式 '\  uxxxx'  \   u表示Unicode转义序列开始 
		char c = '\u0041';
		System.out.println(c);
		//注意在注释中出现\  u也会认为为Unicode转义序列会报错
		//4.使用数赋值，char为2字节无符号类型 0- 65535
		char c1 = 97; //十进制==>
		c1 = 'a'; //==>
		c1 = '\141'; //八进制数 ==》
		c1 = '\u0061'; //实际上是十六进制数

		//Char类型封装类Character

	}
}