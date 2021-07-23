



class LargestOddNumber {

// RT: 11ms 16.6%/MU 52.1 13.95%
	public String largestOddNumber(String num) {
		for (int i=num.length()-1;i>=0 ;i--) {
			
			if (Integer.parseInt("" + num.charAt(i))%2!=0) {
				return num.substring(0,i+1);
			}
		}
		return "";
	}


// RT: 3ms 39.5%/MU 52.3 35.46%
	public String largestOddNumberAlt(String num) {
		int index=-1;
		for (int i=num.length()-1;i>=0 ;i--) {
			
			if ((num.charAt(i)-'0')%2==1) {
				index=i;
				break;
			}
		}
		return index==-1?"": num.substring(0,index+1);
	}




	public static void main(String[] args) {


		String number="22524";
		LargestOddNumber obj=new LargestOddNumber();

		//String result=obj.largestOddNumber(number);
		System.out.println(obj.largestOddNumberAlt(number));

	}
}


