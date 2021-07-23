
//import java.util.HashMap;
import java.util.*;
import java.util.HashMap;

class NumberGoodPairs{

	public int numIdenticalPairs(int[] nums) {

		//HashMap<Integer,Integer> storage=new HashMap<Integer,Integer>();
		//Arrays.sort(nums);
		int count=0;

		for (int i=0;i<nums.length ;i++ ) {
			for (int j=i+1;j<nums.length ;j++ ) {
				if (nums[i]==nums[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public int numIdenticalPairsFast(int[] nums) {

		int pairs=0;
		int[] freq=new int[101];

		for (int k=0;k<nums.length;k++ ) {
			freq[nums[k]]++;
		}

		for (int l=0;l<101 ;l++ ) {			
			if (freq[l]>1) {
				pairs+=(freq[l]*(freq[l]-1))/2;
			}
		}
		return pairs;
	}



public int numIdenticalPairsHash(int [] nums){
	int counter=0;

	HashMap<Integer,Integer> map =new HashMap<>();

	for (int n :nums ) {
		map.put(n,map.getOrDefault(n,0)+1);
		counter+=map.get(n)-1;
	}
	return counter;

}

	public static void main(String[] args) {

		int [] inputArray={1,2,3,1,1,3,4,5,5,5};
		NumberGoodPairs obj=new NumberGoodPairs();

		int result=obj.numIdenticalPairsHash(inputArray);
		System.out.println(result);
	}


}