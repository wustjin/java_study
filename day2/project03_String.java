public class project03_String
{
	private int a;//实例变量属于对象（实例），每次创建对象时才会生成实例变量
	public static void main(String[] args){
		//int b = a; //Err
		//字符本身符合Unicode标准。 char
		//且与C和C++不同，String不用 '\0' 作为结束。
		//1.直接赋值
		String s1 = "Hello";
		//2.间接赋值 
		String s2 = new String("hello");

		//java中没有指针，只有地址和引用
		//区别
		String str1 = "123";
		String str2 = "123";
		String str5 = new String("123");
		String str6 = new String("123");
		//上面创建的都是引用，指向堆中数据
		/*创建字符串常量时，JVM会检查字符串常量池中是否存在这个字符串；
若字符串常量池中存在该字符串，则直接返回引用实例；若不存在，先实例化该字符串，
并且，将该字符串放入字符串常量池中，以便于下次使用时，直接取用，达到缓存快速使用的效果。
		*/
		if(str1 == str2) System.out.println("str1 == str2：true");
		if(str5 != str6) System.out.println("str5 != str6：true");
		if(str1 != str5) System.out.println("str1 != str5：true");
		if(str1 != str6) System.out.println("str1 != str6：true");
	}
}