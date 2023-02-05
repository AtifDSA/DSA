
public class Leetcode125 {

	public static void main(String[] args) {
		//125. Valid Palindrome
		//https://leetcode.com/problems/valid-palindrome/
		
		String str="MOMAAA";
		//System.out.println(str.length());
		
		if(cheackPallindrome(0,(str.length()-1),str))
		{
			System.out.println("Input string is pallindrome");
		}
		else
		{
			System.out.println("Input string is not pallindrome");
			
		}
		
		

	}
	
	static boolean cheackPallindrome(int start,int end,String str)
	{
		if(start>=end)
		{
			return true;
		}
		if(str.charAt(start)!=str.charAt(end))
		{
			return false;
		}
		
		return cheackPallindrome(start+1,end-1,str);
	}

}
