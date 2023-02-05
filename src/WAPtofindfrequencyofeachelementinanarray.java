import java.util.Arrays;

public class WAPtofindfrequencyofeachelementinanarray {

	public static void main(String[] args) {
		
		int nums[]= {2,5,6,6,2,2,4,4,1,1,1,1,2,2,14};
		
		int freq[]=new int[nums.length];
		
		for(int i=0;i<freq.length;i++)
		{
			freq[nums[i]]++;
		}
		
		System.out.println(Arrays.toString(freq));

	}

}
