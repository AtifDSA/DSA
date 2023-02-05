
public class IntegerrToString {
	
	public static String method(int num)
	{
		String result="";
		int src=num;
		while(src!=0)
		{
			int rem=src%10;
			result=rem+result;
			src=src/10;
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		String str=method(1234);
		
		System.out.println(str);
		

	}

}
