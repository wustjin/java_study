public class project03_String
{
	private int a;//ʵ���������ڶ���ʵ������ÿ�δ�������ʱ�Ż�����ʵ������
	public static void main(String[] args){
		//int b = a; //Err
		//�ַ��������Unicode��׼�� char
		//����C��C++��ͬ��String���� '\0' ��Ϊ������
		//1.ֱ�Ӹ�ֵ
		String s1 = "Hello";
		//2.��Ӹ�ֵ 
		String s2 = new String("hello");

		//java��û��ָ�룬ֻ�е�ַ������
		//����
		String str1 = "123";
		String str2 = "123";
		String str5 = new String("123");
		String str6 = new String("123");
		//���洴���Ķ������ã�ָ���������
		/*�����ַ�������ʱ��JVM�����ַ������������Ƿ��������ַ�����
���ַ����������д��ڸ��ַ�������ֱ�ӷ�������ʵ�����������ڣ���ʵ�������ַ�����
���ң������ַ��������ַ����������У��Ա����´�ʹ��ʱ��ֱ��ȡ�ã��ﵽ�������ʹ�õ�Ч����
		*/
		if(str1 == str2) System.out.println("str1 == str2��true");
		if(str5 != str6) System.out.println("str5 != str6��true");
		if(str1 != str5) System.out.println("str1 != str5��true");
		if(str1 != str6) System.out.println("str1 != str6��true");
	}
}