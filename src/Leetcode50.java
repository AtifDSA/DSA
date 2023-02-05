
public class Leetcode50 {

	public static void main(String[] args) {
		//50. Pow(x, n)
		//https://leetcode.com/problems/powx-n/description/
		double x = 2.00000; 
		int n = 10;
		double nn=n;
		double ans=1;
		if(nn<0)
		{
			nn=Math.abs(nn);
		}
		while(nn>0)
		{
			if(nn%2==0)
			{
				x=x*x;
				nn=nn/2;
				
			}
			else
			{
				ans=ans*x;
				nn--;
			
			}
				
			
		}
		if(n<0)
		{
			ans=(double)1/(double)ans;
		}
		System.out.println(ans);
		

	}

}
