

public class ReverseInt{

	public static int revInt(int number){

//Long  allocation due to Int MaxValue test.
		long reverseInteger=0;
		int digit=0;

		while (number!=0){
			reverseInteger=reverseInteger*10+number%10;
			number=number/10;
			if (reverseInteger>Integer.MAX_VALUE||reverseInteger<Integer.MIN_VALUE) {
				return 0;
			}
		}
		return (int)reverseInteger;
	}

	public static void main(String[] args) {
		int number=12345;
		int result=revInt(number);
		System.out.println(result);
	}
}

/* Longer version. RT: 1 100/MU 35.7 91.49%
		while (number!=0){
			if (reverseInteger==0) {
				digit=number % 10;
				reverseInteger=digit;
				number=number/10;
			}else { digit=number % 10;
				number=number/10;
				reverseInteger=reverseInteger*10+digit;
				if (reverseInteger>Integer.MAX_VALUE||reverseInteger<Integer.MIN_VALUE) {
					return 0;
				}
			}
		}
		return (int)reverseInteger;
	}
*/