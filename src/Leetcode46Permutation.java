import java.util.ArrayList;
import java.util.List;

public class Leetcode46Permutation {

		static void helper(int pos,int n,int nums[],List<List<Integer>> res)
		{
			if(pos>=n)
			{
				res.add(new ArrayList<Integer>(ConverToList(nums)));
				
				return;
			}
			for(int i=pos;i<n;i++)
			{
				swap(pos,i,nums);
				helper(pos+1,n,nums,res);
				swap(pos,i,nums);
			}
			return;
		}

		static void swap(int pos, int i, int[] nums) 
		{
				int temp=nums[i];
				nums[i]=nums[pos];
				nums[pos]=temp;	
		}
		static List<Integer> ConverToList(int nums[])
		{
			List<Integer> ans=new ArrayList<>();
			for(int ele:nums)
			{
				ans.add(ele);
			}
			return ans;
			
		}

	public static void main(String[] args) 
	{
		List<List<Integer>> res=new ArrayList<>();
		int nums[]= {1,2,3};
		helper(0,nums.length,nums,res);
		
		System.out.println(res);
		
	}

}
