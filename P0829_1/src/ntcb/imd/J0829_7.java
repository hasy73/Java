package ntcb.imd;

public class J0829_7 {
	public static void main(String args[])
	{
		int[] array={3,7,8,2,5,};
		int sum=0;
		for (int i=0;i<array.length;i++)
		{
			sum+=array[i];
			//System.out.print(array[i]+" ");
		}
		System.out.print(sum/array.length);
	}
}
