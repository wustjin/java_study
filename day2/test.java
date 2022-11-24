import java.util.Arrays;

public class test
{
	static void test( int[ ] a ){
       a = new int[ ] {1, 2, 3};   
    }
    static void test2( int[ ] a ){
        if(a != null && a.length > 0)
          a[0]++;            
    }
    public static void main(String[] args) {		
        int[] aa = {3, 2, 1};   System.out.println(Arrays.toString(aa));  
        test(aa);      System.out.println(Arrays.toString(aa));
        test2(aa);    System.out.println(Arrays.toString(aa));  
    }

}