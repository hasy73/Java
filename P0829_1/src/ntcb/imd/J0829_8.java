package ntcb.imd;

import java.util.Arrays;

public class J0829_8 {
	public static void main(String args[])
	{
		int[] array={3,6,8,2,5};
		
		System.out.print("排序前:");
		for (int i=0; i<array.length;i++)
			System.out.print(array[i]+" ");
		
		Arrays.sort(array);
		
		System.out.print("排序後:");
		for (int i=0; i<array.length;i++)
			System.out.print(array[i]+" ");
		
		int s=Arrays.binarySearch(array, 5);
		if (s>=0)
			System.out.print("\n8在第"+(s+1)+"個");
		else
			System.out.print("\n找不到搜尋值");
	}
}
