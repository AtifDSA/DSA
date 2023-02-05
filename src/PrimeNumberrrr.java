import java.util.ArrayList;
import java.util.List;

public class PrimeNumberrrr {

	public static void main(String[] args) {
		
		List<Integer> lst=new ArrayList<Integer>();
		
		for(int i=2;i<999;i++)
		{
			int counter=0;
			
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					counter++;
				}
			}
			
			if(counter==2)
			{
				lst.add(i);
			}
		}
		
		System.out.println(lst);
		

	}

}
