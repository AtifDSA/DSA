
public class Findsumof2elmentspresentinindex {

	public static void main(String[] args) {
		
		//WAP to find sum of 2 elments present in index(example starting index is 2 and ending index 5) of input array

		int nums[]= {5,2,1,3,4,0,8,7,2};
		
		int res[]=new int[nums.length];
		
		res[0]=nums[0];
		for(int i=1;i<res.length;i++)
		{
			res[i]=res[i-1]+nums[i];
			
		}
		//System.out.println(res[3]);
		
		System.out.println(res[5]-res[1]);

	}

}
