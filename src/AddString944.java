
public class AddString944 {

	public static void main(String[] args) {
		/*
		 * Input: num1 = "11", num2 = "123"
		 * Output: "134"
		 * 
		 */
		/*
		 * Given input as two non-negative integers, num1 and num2 represented as string
		 * 
		 * return the result as sum of num1 and num2 as a string
		 * 
		 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger). 
		 * 
		 * You must also not convert the inputs to integers directly.
		 * 
		 * 
		 */
		
		String nums1="123";
		String nums2="22";
		int x=nums1.length()-1;
		int y=nums2.length()-1;
		String result="";
		int carry=0;
		while(x>=0 || y>=0 || carry!=0)
		{
			int firstNum=0;
			int scndNum=0;
			if(x>=0)
			{
				firstNum=nums1.charAt(x)-'0';
				
			}
			else
			{
				firstNum=0;
			}
			if(y>=0)
			{
				scndNum=nums2.charAt(y)-'0';
				
			}
			else
			{
				scndNum=0;
			}
			
			
			int sum=firstNum+scndNum+carry;
			result=sum%10+result;//5 45 145
			carry=sum/10;
			x--;
			y--;
		}
		System.out.println(result);

	}

}
