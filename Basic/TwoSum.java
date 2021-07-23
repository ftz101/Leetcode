import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{

	public static int[] twoSum(int[] nums, int target){


		for (int i=0;i<nums.length;i++ ) {
			int diff=target-nums[i];
			for (int j=i+1;j<nums.length;j++ ) {
				if (nums[j]==diff) {
					return new int [] {i,j}; 
				}
			}
		}

		throw new IllegalArgumentException("No Two sums found");
	}



	public static int[] twoSumMap(int[] nums,int target){

		HashMap<Integer,Integer> MapNumbers=new HashMap<>();
		int [] output=new int[2];

		for (int k=0;k<nums.length ;k++ ) {
			int difference=target-nums[k];
			if (MapNumbers.containsKey(difference)) {
				output[0]=MapNumbers.get(difference);
				output[1]=k;
				return output;	
			}
			MapNumbers.put(nums[k],k);
		}

		throw new IllegalArgumentException("no HashMap Solution");
	}


	public static void main(String[] args) {

		int targett=9;
		int [] numbers={2,3,4,7};
		int [] result=twoSumMap(numbers, targett);
		System.out.println(Arrays.toString(result));
	}
}