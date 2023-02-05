
public class PrintNamesRecursion {
	static void func(int start,int n)
	{
		if(start>n)
		{
			return;
		}
		System.out.println("Atif Hossain");
		
		func(start+1,n);
	}

	public static void main(String[] args) {
		//WAP to print name n times using recursion
		
		int n=5;
		func(1,n);
	

	}

	

}
