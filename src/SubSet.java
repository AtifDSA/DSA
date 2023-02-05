import java.util.ArrayList;
import java.util.List;

public class SubSet {

	public static void main(String[] args) {
		
		int nums[]= {1,2,3};
		List<List<Integer>> res=new ArrayList(); //PowerSet
		List<Integer> current=new ArrayList();
		res.add(current);
		for(int i=0;i<nums.length;i++)
		{
			int n=res.size();
			System.out.println(n);
			for(int j=0;j<n;j++)
			{
				System.out.println(res.get(j));
				List<Integer> temp=new ArrayList(res.get(j));
				temp.add(nums[i]);
				res.add(temp);
				
			}
			
			System.out.println(res);
			
		}
		//System.out.println(res);
	
	}

}
