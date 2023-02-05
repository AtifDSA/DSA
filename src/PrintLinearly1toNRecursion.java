
public class PrintLinearly1toNRecursion {

	public static void main(String[] args) {
		//WAP to print linearly 1 to N using Recursion
		int n=4;
		func(1,n);
		

	}
	static void func(int i,int n)
	{
		if(i>n)
		{
			return;
		}
		System.out.println(i);
		func(i+1,n);
	}

}
