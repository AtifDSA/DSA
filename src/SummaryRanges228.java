import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {

	public static void main(String[] args) {
		int nums[]= {0,1,2,4,5,7};
		List<String> lst=new ArrayList<String>();
		for(int i=0;i<nums.length;i++) // 
		{
			int start=nums[i];
			
			while(i<nums.length-1 && nums[i]+1==nums[i+1])
			{
				i++;
			}
			if(start==nums[i])
			{
				lst.add(start+"");
			}
			else
			{
				lst.add(start+"->"+nums[i]);
			}
		}
		
		System.out.println(lst);

	}

}
