public class project01_1Char
{
	public static void main(String[] args){
		//charֵ�ļ��ֱ�ʾ��ʽ
		//1.�������ַ����� 
		char a = 'a';
		//2.�ַ�ת������
		char b = '\n';//���а˸�Ԥ����ת������,�����Զ��� ת��������\��ʼ 
		//char c = '\a'; //Errδ֪ת������
		//3.Unicode
		//�ַ���ʾ��ʽ '\  uxxxx'  \   u��ʾUnicodeת�����п�ʼ 
		char c = '\u0041';
		System.out.println(c);
		//ע����ע���г���\  uҲ����ΪΪUnicodeת�����лᱨ��
		//4.ʹ������ֵ��charΪ2�ֽ��޷������� 0- 65535
		char c1 = 97; //ʮ����==>
		c1 = 'a'; //==>
		c1 = '\141'; //�˽����� ==��
		c1 = '\u0061'; //ʵ������ʮ��������

		//Char���ͷ�װ��Character

	}
}