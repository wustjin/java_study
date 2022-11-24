//import java.util.Character;
import java.util.Scanner;

public class totalChar
{
	public static void main(String[] args){
		String str = new Scanner(System.in).nextLine();
		//统计大小写字符，空格，数字个数
		int xiao = 0,da = 0,num = 0,blank = 0;
		for(int i = 0; i < str.length(); i++){
			if(Character.isLowerCase(str.charAt(i)))  xiao++;
			else if(Character.isUpperCase(str.charAt(i))) da++;
		}
		System.out.println("大写字符个数：" + da + "小写字符个数：" + xiao);
	}
}