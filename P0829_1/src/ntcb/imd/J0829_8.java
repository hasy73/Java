package ntcb.imd;

import java.util.Arrays;

public class J0829_8 {
	public static void main(String args[])
	{
		int[] array={3,6,8,2,5};
		
		System.out.print("�Ƨǫe:");
		for (int i=0; i<array.length;i++)
			System.out.print(array[i]+" ");
		
		Arrays.sort(array);
		
		System.out.print("�Ƨǫ�:");
		for (int i=0; i<array.length;i++)
			System.out.print(array[i]+" ");
		
		int s=Arrays.binarySearch(array, 5);
		if (s>=0)
			System.out.print("\n8�b��"+(s+1)+"��");
		else
			System.out.print("\n�䤣��j�M��");
	}
}
