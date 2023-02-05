
public class PatternTricky {

	public static void main(String[] args) {
		int n=3;
		
		for(int row=1;row<=n;row++)
		{
			for(int s=1;s<=n-row;s++)//4 3 2 1 0
			{
				System.out.print(" ");
			}
			for(int col=1;col<=2*row-1;col++)//1 3 5 7 9
			{
				System.out.print("*"); 
			}
			System.out.println();
		}

	}

}
