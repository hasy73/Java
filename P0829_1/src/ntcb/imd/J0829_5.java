package ntcb.imd;

public class J0829_5 {
	public static void main(String args[])
	{
		char i='c';
		switch(i)
		{
			case 'a':
			case 'A':
				System.out.print("i值為A");
				break;
			case 'b':
			case 'B':
				System.out.print("i值為B");
				break;
			default:
				System.out.print("i值不為A、B");
		}
	}
}
