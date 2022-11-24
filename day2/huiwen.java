import java.util.Scanner;

public class huiwen
{

	public static boolean is_huiwen(String str){
		boolean flag = true;//
		char ch1, ch2;
		int len = str.length();
		for(int i = 0; i<len/2; i++){
			ch1 = str.charAt(i);
			ch2 = str.charAt(len-1-i);
			if(ch1 != ch2) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args){
		String str;
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		System.out.println(str);
		boolean status = is_huiwen(str);
		if(status) {
			System.out.println("�ǻ���");
		}
	}
}
