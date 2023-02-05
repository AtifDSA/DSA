import java.util.Arrays;

public class ReverseIntegerArrayRecursion {

	public static void main(String[] args) {
		
		int nums[]= {1,2,3,4,5};
		
		reverseHelper(nums,0,nums.length-1);
		System.out.println(Arrays.toString(nums));
		
	}
	
	static void reverseHelper(int nums[],int start,int end)
	{
		if(start>=end)
		{
			return;
		}
		int temp=nums[start];
		nums[start]=nums[end];
		nums[end]=temp;
		
		reverseHelper(nums,start+1,end-1);
		
	}

}
