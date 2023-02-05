
public class SelectionSort {
	
	public static int[] selectionSort(int nums[])
	{
		//int arr[] = {64,25,12,22,11};
		
		for(int i=0;i<nums.length;i++)
		{
			int min_index=i;
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[j]<nums[min_index])
				{
					min_index=j;
					int temp=nums[min_index];
					nums[min_index]=nums[i];
					nums[i]=temp;
					
				}
			}
		}
		
		
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
