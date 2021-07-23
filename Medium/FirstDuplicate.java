

public class FirstDuplicate{

	public  int findDuplicate(int [] nums){

		int minIndexValue=nums.length;

		for (int i=0;i<nums.length;i++ ) {
			for (int j=i+1;j<nums.length;j++ ) {

				if (nums[j]==nums[i]){
					minIndexValue=nums[j];
				}
				
			}

		}
		return minIndexValue;
		
	}


	int findDupFast(int [] numbers){

		int dupNumber=0;

		PARENT_LOOP: for (int k=0;k<numbers.length;k++) {

			if (numbers[java.lang.Math.abs(numbers[k])]>0){
				numbers[java.lang.Math.abs(numbers[k])]=numbers[java.lang.Math.abs(numbers[k])]*(-1);
			}else {
				dupNumber=java.lang.Math.abs(numbers[k]);
				break PARENT_LOOP;
			}
		}
		return dupNumber;
	}





	public static void main(String[] args) {
		
		int [] inputArray={4,2,4,3,1};
		FirstDuplicate obj= new FirstDuplicate();
		int result=obj.findDupFast(inputArray);
		System.out.println(result);


	}
}

