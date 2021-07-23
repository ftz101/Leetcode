
import java.util.*;

public class BuildArray {


// RT: 0ms 100%/MU 39.8.1 58.53%
	public int[] buildArray(int[] nums) {

		int[] outputArray=new int[nums.length];

		for (int i=0;i<=nums.length-1 ;i++ ) {

			outputArray[i]=nums[nums[i]];
		}

		return outputArray;

	}



	public static void main(String[] args) {

		int[] testArray={0,2,1,5,3,4};

		BuildArray obj=new BuildArray();

		System.out.println(Arrays.toString(obj.buildArray(testArray)));

	}
}