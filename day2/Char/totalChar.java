//import java.util.Character;
import java.util.Scanner;

public class totalChar
{
	public static void main(String[] args){
		String str = new Scanner(System.in).nextLine();
		//ͳ�ƴ�Сд�ַ����ո����ָ���
		int xiao = 0,da = 0,num = 0,blank = 0;
		for(int i = 0; i < str.length(); i++){
			if(Character.isLowerCase(str.charAt(i)))  xiao++;
			else if(Character.isUpperCase(str.charAt(i))) da++;
		}
		System.out.println("��д�ַ�������" + da + "Сд�ַ�������" + xiao);
	}
}