import java.util.ArrayList;
import java.util.List;

public class primeNumber {

	public static void main(String[] args) {
		
		int num=999;
		List<Integer> lst=new ArrayList<Integer>();
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				lst.add(i);
				
			}
		}
		System.out.println(lst);

	}

}
