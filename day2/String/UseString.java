//import java.lang.Integer;

public class UseString
{
	public static void main(String[] args){
		//1.�ַ�������ֱ��ת��
		//1.1�ַ���תΪֵ 
		String str_num = "123";
		int num = Integer.parseInt(str_num);//ע��÷�������������ַ���һ��Ҫ�ܽ���Ϊint�Ĳ���
		double num1 = Double.parseDouble("1.11");
		num = Integer.valueOf("123").intValue();//valueOf���ص��Ƕ������Ի���Ҫȡ������ֵ�ٸ���num

		System.out.println(num);
		System.out.println(num1);
		//1.2ֵתΪ�ַ���
		String s = String.valueOf(20);//����Ϊ������ֵboolean,char,char[],num��Object
		System.out.println(s);
		s = Integer.toString(12);
		System.out.println(s);
		s = "" + 12;
		System.out.println(s);

		//2.�ַ������String
		char[] c = {'a','b','c'};
		String s1 = new String(c);
		s1 = String.valueOf(c);
		char[] c1 = s1.toCharArray();
		System.out.println(c1[0]);
		//System.out.println(s1[0]);//�ַ�������ͨ���±����
		System.out.println(s1.charAt(0));

		//3.����������������String����ΪString�ǲ��ɱ�ģ�
		//3.1concat
		String t = new String("hello");
		String t1 = t.concat(" java");//������String�����ı�ԭ�ַ���
		System.out.println(t + t1);
		//3.2replace(old, new)
		t = "abcd";
		t1 = t.replace("a", "bcd");
		System.out.println(t + t1);
		//3.3substring
		t = "abcde";
		t1 = t.substring(0,3);//[start,end)
		System.out.println(t + t1);

		//���⻹��toLowerCase()��toUpperCase()

		
	}
}