import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxElementRow {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> lst=new ArrayList<Integer>();
		int res[]=new int[arr.length];
		int maxRowElement=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			maxRowElement=0;
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>maxRowElement)
				{
					maxRowElement=arr[i][j];
				}
				
				
			}
			lst.add(maxRowElement);
			
		}
		for(int i=0;i<res.length;i++)
		{
			res[i]=lst.get(i);
		}
		
		

	}

}
