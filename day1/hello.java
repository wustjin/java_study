

public class hello
{
	private int i=100, j;
    private boolean f;
    public void display(){
		System.out.println("j="+(j=j+1));
        System.out.println("f="+f);
	}
	public static void main (String args[]) {
		hello a = new hello();
		a.display();
	}

}  