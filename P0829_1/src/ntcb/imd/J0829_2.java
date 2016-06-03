package ntcb.imd;

public class J0829_2 {
	public static void main(String args[])
	{
		int a=5;
		int b=10;
		
		if(a>=b || a!=b)
			System.out.println("a大於等於b，或a不等於b");
		else if(a<=b && a<10)
			System.out.println("a小於等於b，且a小於b");
		else
			System.out.println("以上條件不成立");
	}
}
