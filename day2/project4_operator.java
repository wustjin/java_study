public class project4_operator
{
	public static void main(String[] args){
		//1.��������
		//���Ķ���%�������ڸ�����
		double d = 9.5 %2; //1.5
		System.out.println(d);

		//2.��ϵ����>,<,>=,<=,
		//3.�����߼�����
		//&&��|| ���ж�·ЧӦ
		//4.λ����
		// >>>��0������ƣ��޷������ƣ�

		//5.����ת�� 
		short a =5, b = 10, c =0;
		//c = a+b; //Err 
		//����ʽ��ֵ��ʱ�򣬲��������Զ�������Ϊ int �ͣ�
		//������Ҳ������Ϊ int �͡���������ʽ�Ľ�������� int �ͣ���ǿ��ת�����Ͳ��ܱ���Ϊ short �͡�
		c = (short)(a+b);
	}
}