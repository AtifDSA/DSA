import java.util.ArrayList;
import java.util.List;

public class Leeetcode78Subset {

	public static void main(String[] args) {
		//78. Subsets
		//https://leetcode.com/problems/subsets/
		int nums[]= {1,2};
		//Creating a list of list
		List<List<Integer>> res=new ArrayList();
		res.add(new ArrayList());
		for(int i=0;i<nums.length;i++)
		{
			int n=res.size();
			for(int j=0;j<n;j++)
			{
				List<Integer> temp=new ArrayList(res.get(j));
				temp.add(nums[i]);
				res.add(temp);
			}
			
		}
		//System.out.println(res.size());
	
	}

}
