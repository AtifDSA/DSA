
public class RecursionPowerOfNumber {

	public static void main(String[] args) {
		//WAP to find power of number
		
		System.out.println(power(2,2));
		//System.out.println(1/2);
		

	}
	
	static int power(int num,int x)
	{
		
		if(x==0)
		{
			return 1;
		}
		int partialAns=power(num,x/2);
		
		int ans=partialAns*partialAns;
		
		if(x%2==1)
		{
			ans=ans*num;
		}
		
		return ans;
		
	}

}
