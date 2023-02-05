
public class MatrixDiagonalSum1572 {

	public static void main(String[] args) {
		
		int mat[][]= {{5}};
		int sum=0;
		int n=mat.length;
		//System.out.println(mat.length);
		
		for(int i=0;i<n;i++)
		{
			sum=sum+mat[i][i]+mat[i][n-i-1];
		}
		System.out.println(sum);

	}

}
