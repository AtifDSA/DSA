import java.util.ArrayList;
import java.util.List;

public class Subsettttt {

	public static void main(String[] args) {
		//input array
		int nums[]= {1,2};
		List<List<Integer>> res=new ArrayList();
		res.add(new ArrayList());
		//res.add(tempStorage);
		for(int i=0;i<nums.length;i++) 
		{
			int n=res.size(); 
			System.out.println(n); 
			
			for(int j=0;j<n;j++)
			{
				List<Integer> temp=new ArrayList(res.get(j));
				temp.add(nums[i]);
				res.add(temp);
				
				
			}
		}
		//System.out.println(res);
		
		
		
		
		

	}

}
