import java.util.ArrayList;
import java.util.List;

public class LeetCode1408 {

	public static void main(String[] args) {
		
		String inputStr[]= {"mass","as","hero","superhero"};
		List<String> resList=new ArrayList<String>();
		for(int i=0;i<inputStr.length;i++)
		{
			for(int j=0;j<inputStr.length;j++)
			{
				if(inputStr[j].equals(inputStr[i])==false && inputStr[j].contains(inputStr[i]))
				{
					resList.add(inputStr[i]);
					break;	
				}
			}
		}
		
		System.out.println(resList);
		

	}

}
