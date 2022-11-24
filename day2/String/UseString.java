//import java.lang.Integer;

public class UseString
{
	public static void main(String[] args){
		//1.字符和数字直接转换
		//1.1字符串转为值 
		String str_num = "123";
		int num = Integer.parseInt(str_num);//注意该方法有问题关于字符串一定要能解析为int的才行
		double num1 = Double.parseDouble("1.11");
		num = Integer.valueOf("123").intValue();//valueOf返回的是对象，所以还需要取出其中值再赋给num

		System.out.println(num);
		System.out.println(num1);
		//1.2值转为字符串
		String s = String.valueOf(20);//可以为任意数值boolean,char,char[],num，Object
		System.out.println(s);
		s = Integer.toString(12);
		System.out.println(s);
		s = "" + 12;
		System.out.println(s);

		//2.字符数组和String
		char[] c = {'a','b','c'};
		String s1 = new String(c);
		s1 = String.valueOf(c);
		char[] c1 = s1.toCharArray();
		System.out.println(c1[0]);
		//System.out.println(s1[0]);//字符串不能通过下标访问
		System.out.println(s1.charAt(0));

		//3.常见方法（创建新String，因为String是不可变的）
		//3.1concat
		String t = new String("hello");
		String t1 = t.concat(" java");//返回新String，不改变原字符串
		System.out.println(t + t1);
		//3.2replace(old, new)
		t = "abcd";
		t1 = t.replace("a", "bcd");
		System.out.println(t + t1);
		//3.3substring
		t = "abcde";
		t1 = t.substring(0,3);//[start,end)
		System.out.println(t + t1);

		//此外还有toLowerCase()，toUpperCase()

		
	}
}