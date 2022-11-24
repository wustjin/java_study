public class project4_operator
{
	public static void main(String[] args){
		//1.算术运算
		//最大改动，%可以用于浮点数
		double d = 9.5 %2; //1.5
		System.out.println(d);

		//2.关系运算>,<,>=,<=,
		//3.布尔逻辑运算
		//&&、|| 具有短路效应
		//4.位运算
		// >>>：0填充右移（无符号右移）

		//5.类型转换 
		short a =5, b = 10, c =0;
		//c = a+b; //Err 
		//表达式求值的时候，操作数被自动的提升为 int 型，
		//计算结果也被提升为 int 型。这样表达式的结果现在是 int 型，不强制转换它就不能被赋为 short 型。
		c = (short)(a+b);
	}
}