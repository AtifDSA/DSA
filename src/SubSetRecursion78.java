import java.util.ArrayList;
import java.util.List;

public class SubSetRecursion78 {

	public static void main(String[] args) {
		//input array
		int nums[]= {1,2};
		//List of list----->res
		List<List<Integer>> res=new ArrayList<>();
		helper(nums,0,new ArrayList<>(),res);
		System.out.println(res);
		
		
	}
	static void helper(int nums[],int ci,List<Integer> subset,List<List<Integer>> res)
	{
		
		//base condition
		if(ci==nums.length)
		{
			res.add(new ArrayList(subset));
			return;
		}
		subset.add(nums[ci]);
		helper(nums,ci+1,subset,res);
		subset.remove(subset.size()-1);
		helper(nums,ci+1,subset,res);
		
		
		
		
	
	}

}
