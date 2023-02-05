import java.util.Arrays;

public class DeleteGreatestValueinEachRow {

	public static void main(String[] args) {
		//input array
		int nums[][]= {{1,2,4},{3,3,1}};

		for(int i=0;i<nums.length;i++)
		{
			//Sorting in ascending order each row of 2 dimentional input array.
			Arrays.sort(nums[i]);
			//System.out.println(Arrays.toString(nums[i]));
		}
		//to add maximum element in ans before deleting
		int ans=0;
		//Colum wise iterating
		for(int j=0;j<nums[0].length;j++) // j--------->0 1 2 
		{
			int max=0;
			for(int i=0;i<nums.length;i++)// i---------->0 1
			{
				max=Math.max(max,nums[i][j]);
			}
			ans=ans+max; //2+3+3
		}
		System.out.println(ans);
		
		
	}

}
