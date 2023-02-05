
public class RecursionFactorial {

	public static void main(String[] args) 
	{
		int num=5;
		System.out.println(fact(num));
	
	}
	
	static int fact(int num)
	{
		int ans;
		if(num==0)
		{
			return 1;
		}
		ans=num*fact(num-1);
		
		return ans;
	}

}
