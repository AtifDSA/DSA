
public class MaxElement {

	public static void main(String[] args) {
		
		int nums[][]= {{2,1,1},{1,7,9},{1,1,1}};
		
		int row=3;
		int col=3;
		int maxOneCount=Integer.MIN_VALUE;
		int maxRowIndex=Integer.MIN_VALUE;
		for(int i=0;i<row;i++)
		{
			int rowOneCount=0;
			for(int j=0;j<col;j++)
			{
				if(nums[i][j]==1)
				{
					rowOneCount++;
					
				}
			}
			if(rowOneCount>maxOneCount)
			{
				maxOneCount=rowOneCount;
				maxRowIndex=i;
			}
		}
		
		System.out.println(maxRowIndex);

	}

}
