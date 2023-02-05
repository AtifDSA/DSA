
public class test {

	public static void main(String[] args) {
		
		//Sum of digits of number
//		int num=900;
//		int sum=0;
//		while(num>0)
//		{
//			sum=sum+num%10;
//			num=num/10;
//		}
//		System.out.println(sum);
		
		int num=123;
		int rev=0;
		
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		
		System.out.println(rev);
		
		

	}

}
