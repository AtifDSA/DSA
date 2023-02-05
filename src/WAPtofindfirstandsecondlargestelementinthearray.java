
public class WAPtofindfirstandsecondlargestelementinthearray {

	public static void main(String[] args) {
		int nums[]= {45,68,9700,76,901,9700};
		
		int max_first=Integer.MIN_VALUE;
		int max_second=Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>=max_first)
			{
				max_second=max_first;
				max_first=nums[i];
			}
			else if(nums[i]>max_second)
			{
				max_second=nums[i];
			}
		}

	}

}
