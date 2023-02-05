import java.util.ArrayList;
import java.util.List;

public class ArmstrongImplementation {
	
	static boolean isArmStrong(int number)
	{
		int temp=number;
		int digits=0;
		int last=0;
		double sum=0;
		//counting number of digits in input number
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		temp=number;
		while(temp>0)
		{
			last=temp%10;//last digit of the number
			sum=sum+(Math.pow(last, digits));
			temp=temp/10;
		}
		if(number==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) 
	{
		List<Integer> lst=new ArrayList<Integer>();
		
		for(int i=0;i<=999;i++)
		{
			if(isArmStrong(i))
			{
				lst.add(i);
			}
		}
		
		System.out.println(lst);
		
		

	}

}
