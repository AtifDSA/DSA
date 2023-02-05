import java.util.Arrays;

public class ApplyOperationsArray2460 {

	public static void main(String[] args) {
		/*
		 * consisting of non-negative integers.
		 * array nums of size n
		 * 0-indexed
		 * 
		 * 
		 * 
		 * 
		 */
		int nums[]= {1,2,2,1,1,0};
		
		/*
		 *  apply n - 1 operations to this array
		 *  in the ith operation (0-indexed)
		 *  you will apply the following on the ith element of nums
		 *  If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to 0
		 *  
		 * 
		 */
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]==nums[i+1])
			{
				nums[i]=nums[i]*2;
				nums[i+1]=0;
			}
		}
		System.out.println(Arrays.toString(nums)); //[1, 4, 0, 2, 0, 0]
		/*
		 * After performing all the operations, shift all the 0's to the end of the array.
		 * 
		 */
		int j=0;
		for(int i=0;i<nums.length-1;i++) // 0 1 2 3
		{
			if(nums[i]!=0) //1 4 2 0 0 0
			{
				int temp=nums[i]; //  1 4 2 
				nums[i]=nums[j]; // 1 4 0
				nums[j]=temp;    // 1 4 2
				j++; //1 2 3
				
			}
		}
		System.out.println(Arrays.toString(nums));
		
		

	}

}
