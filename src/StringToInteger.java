
public class StringToInteger {

	public static void main(String[] args) {
		String str="123";
		int num=0;
		
		for(int i=0;i<str.length();i++)
		{
			num=num*10+(int)str.charAt(i)-48;
		}
		System.out.println(num);

	}

}
