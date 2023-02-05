
public class WAPtofindlargestelementinanarray {

	public static void main(String[] args) {
		int nums[]= {34,56,9000,45,78,5600};
		
		int max_value=Integer.MIN_VALUE; //-2147483648
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>max_value)
			{
				max_value=nums[i];
			}
		}

		System.out.println(max_value+"  "+"is the largest element in input array");
	}

}
