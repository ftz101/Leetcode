


class MaximumWealth {


// RT: 1ms 20.05%/MU 40.3 6.23%
	public int maximumWealth(int [][] accounts) {		
		int max=0;

		for (int i=0;i<accounts.length ;i++ ) {

			int sum=0;
			for (int j=0;j<accounts[i].length ;j++) {
				sum+=accounts[i][j];
			}

			if (sum>=max) {
				max=sum;
			}
		}
		return max;

	}

// 1RT: 0ms 100%/MU 38.8 30.16%
// 2RT: 0ms 100%/MU 38.6 64.08%

	public int maximumWealthEnh(int [][] accounts){

		int max=0;
		for (int[] customer :accounts) {
			int sum=0;
			for (int account : customer) {
				sum+=account;
			}
			//1 max=Math.max(max,sum);
			//2
			if (sum>=max) {max=sum;}
		}
		return max;
	}



	public static void main(String[] args) {

		int[][] testArray={{1,5},{19,3},{15,5}};
		MaximumWealth obj=new MaximumWealth();

		System.out.println(obj.maximumWealthEnh(testArray));


	}


}