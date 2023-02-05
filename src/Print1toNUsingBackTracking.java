
public class Print1toNUsingBackTracking {

	public static void main(String[] args) {
		
		int n=5,i=5;
		
		func(i,n);
		

	}
	static void func(int i,int n)
	{
		if(i<1)
		{
			return;
		}
		func(i-1,n);
		System.out.println(i);
		
	}

}
