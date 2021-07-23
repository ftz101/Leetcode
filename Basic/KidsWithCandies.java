

import java.util.*;
import java.util.ArrayList;


class KidsWithCandies {

// RT: 2ms 16.43%/MU 38.91 68.73%
// RT: 0ms 100%/MU 38.91 79.99%

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		ArrayList<Boolean> array=new ArrayList<Boolean>(candies.length);
		//int max=Arrays.stream(candies).max().getAsInt();

		int max=0;

		for (int h=0;h<candies.length ;h++) {
			
			if (max<candies[h]) {
				max=candies[h];
			}
		}

		for (int i=0;i<candies.length ;i++ ) {
			

			if (candies[i]+extraCandies>=max) {
				array.add(true);
			}else{
				array.add(false);
			}

		}
		return array;
	}


	public static void main(String[] args) {

		int[] testArray={2,3,5,1,3};
		int xtraCan=3;

		KidsWithCandies obj=new KidsWithCandies();

		System.out.println(obj.kidsWithCandies(testArray, xtraCan));
		//System.out.println(Arrays.toString(obj.kidsWithCandies(testArray, xtraCan)));

	}

	
}
