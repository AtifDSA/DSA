
public class PallindromeString {

	public static void main(String[] args) {
		String str="raceacar";
		String st="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetterOrDigit(str.charAt(i)))
			{
				st=st+str.charAt(i);
				
			}
		}
		
		System.out.println(str.length());
			
		

	}

}
