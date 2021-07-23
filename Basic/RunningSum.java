import java.util.Arrays;


class RunningSum{


	public int[] runningSum(int[] nums) {

		//int lenghtArr=nums.length;
		int [] outputArray=new int [nums.length];
		outputArray[0]=nums[0];

		for (int i=1;i<nums.length;i++) {

			outputArray[i]=nums[i]+outputArray[i-1];

		}
		return outputArray;
	}


	public int[] runningSumAlt(int[] numbers){

		//int [] outputArray=new int [nums.length];
		//outputArray[0]=nums[0];

		for (int j=1;j<numbers.length;j++) {

			numbers[j]=numbers[j]+numbers[j-1];

		}
		return numbers;
	}








public static void main(String[] args) {

	int [] inputArray={1,2,3,4,5};
	RunningSum obj=new RunningSum();
	int [] result=obj.runningSumAlt(inputArray);

	System.out.println(Arrays.toString(result));

}

}