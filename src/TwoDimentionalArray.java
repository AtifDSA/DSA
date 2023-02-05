
public class TwoDimentionalArray {

	public static void main(String[] args) {
		int nums[][]= {{12,34,56,89},{23,45,76,97}};
		
		int target=34;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				if(nums[i][j]==target)
				{
					System.out.println("Hurray!!!Element is found");
					break;
				}
			}
		}

	}

}
