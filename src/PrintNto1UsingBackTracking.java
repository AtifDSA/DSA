
public class PrintNto1UsingBackTracking {

	public static void main(String[] args) {
		
		int n=5,i=1;
		
		func(i,n);

	}
	static void func(int i,int n)
	{
		if(i>n)
		{
			return;
		}
		func(i+1,n);
		System.out.println(i);
	}

}
