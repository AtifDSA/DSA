
public class LeetCode875 {

	public static void main(String[] args) {
		
		//WAP to Search target element in an array
		
		int nums[]= {3,45,67,2,100,65,46,78,61};
		
		int target=67;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==target)
			{
				System.out.println("Element present in input array at index "+" "+i);
			}
		}

		

	}

}
