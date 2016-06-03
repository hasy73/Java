package ntcb.imd;

import java.util.Scanner;

public class practice_switch {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("請輸入一數:");
		int i=s.nextInt()/10;
		switch(i)
		{
		case 10:
		case 9:
			System.out.print("A");
			break;
		case 8:
			System.out.print("B");
			break;
		case 7:
			System.out.print("C");
			break;
		default:
			System.out.print("D");
		}
	}
}
