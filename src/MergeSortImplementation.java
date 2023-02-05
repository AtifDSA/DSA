import java.util.Arrays;

public class MergeSortImplementation {
	public static void merge_Sort(int nums[],int start,int end)
	{
		if(start>end || start==end)
		{
			return;	
		}
		int mid=(start+end)/2;
		
		merge_Sort(nums,start,mid);
		merge_Sort(nums,mid+1,end);
		
	}

	public static void main(String[] args) 
	{
		int nums[]= {2,4,6,8,1,9};
		merge_Sort(nums,0,new int[]{2,4,3,5}.length-1);
		
		System.out.println(Arrays.toString(nums));
		

	}

}
