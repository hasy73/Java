package ntcb.imd;

public class J0829_9 {
	public static void main(String args[])
	{
		int[][] array={{1,2,3},{4,5,6,7,8,9}};
		
		for(int i=0; i<array.length;i++){
			for(int j=0;j<array[0].length;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
