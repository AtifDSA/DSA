import java.util.Arrays;

public class Tesssssstt {

	public static void main(String[] args) {
		
		/*
		 *    *
		 *   ***
		 *  *****
		 * 
		 * 
		 * 
		 * 
		 */
//		int n=3;
//		
//		for(int i=1;i<=n;i++)
//		{
//			for(int k=1;k<=n-i;k++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=2*i-1;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		
		int nums[]= {12,23,45,65,71};
		
		int max_first=Integer.MIN_VALUE;
		int max_second=Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>max_first)
			{
				max_second=max_first;
				max_first=nums[i];
			}
			else if(nums[i]>max_second)
			{
				max_second=nums[i];
			}
		}
		
		System.out.println(max_first+"  "+max_second);
		

	}

}
