
public class StringPallindrome {

	public static void main(String[] args) {
		//WAP to find give string is Pallindrome or not
		//2 Pointers approach
		String str="MDFTROM";
		str.
		char ch[]=str.toCharArray();
		
		
		
		int start=0;
		int end=ch.length-1;
		while(start<=end)
		{
			if(ch[start]!=ch[end])
			{
				System.out.println("Given string not pallindrome");
				break;
				
			}
			
			start++;
			end--;
		}
		
		System.out.println("Given string is pallindrome");


	}

}
