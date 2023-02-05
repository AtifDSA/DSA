import java.util.Arrays;

public class testssss {

	public static void main(String[] args) {
//		int X=5;
//		int Y=6;
//		
//		X--;
//		Y++;
//		
//		System.out.println(new int[] {X,Y});
//		String str="Hellouuuuu";
//		int count=0;
//		
//		for(char i:str.toCharArray())
//		{
//			count++;
//			
//		}
//		System.out.println(count);
		
		int arr[]= {5,2,1,3,4};
		
		int res[]=new int[arr.length];
		int k=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			res[k]=arr[i];
			k++;
			if(k==arr.length)
			{
				break;
			}
		}
		
		System.out.println(Arrays.toString(res));
		
		
		

	}

}
