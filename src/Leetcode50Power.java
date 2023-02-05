
public class Leetcode50Power {

	public static void main(String[] args) {
		int x=2;
		int power=10;
		int ans=1;
		while(power>0)
		{
			if(power%2!=0)
			{
				ans=ans*x;
				power=power/2;
			}
			else
			{
				x=x*x;
				power--;
			}
		}
		
		System.out.println(ans);

	}

}
