import java.util.Arrays;

public class BubbleSort {
	
	public static int[] bubbleSort(int nums[])
	{
		for(int i=0;i<nums.length-1;i++)//0 1 2 3 4
		{
			for(int j=0;j<nums.length-1;j++) // 0 1 2 3 
			{
				if(nums[j]>nums[j+1])
				{
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(bubbleSort(new int[] {64, 34, 25, 12, 22, 11, 90})));
		

	}

}
