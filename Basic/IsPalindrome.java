

public class IsPalindrome{

// RT: 6ms 99.98%/MU 37.7 99.68%

	public boolean isPalindrome(int x){
		int number=x;
		long reverseInteger=0;
		int digit=0;

		if (x<0) {
			return false;
		}else{
			while (number!=0){
				reverseInteger=reverseInteger*10+number%10;
				number=number/10;
				if (reverseInteger>Integer.MAX_VALUE||reverseInteger<Integer.MIN_VALUE) {
					return false;
				}
			}
		}

		reverseInteger=(int)reverseInteger;
		if (reverseInteger==x) {
			return true;
		} else {
			return false;
		}
		
	}



	public static void main(String[] args) {

		IsPalindrome obj=new IsPalindrome();

		int num=-12321;
		boolean result=obj.isPalindrome(num);
		System.out.println(result);

	}



}