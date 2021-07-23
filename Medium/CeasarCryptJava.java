
import java.util.Scanner;

public class CeasarCryptJava{

	public static void main(String[] args) {

		String message, encryptedMessage = "";
		int key;
		char ch='a';

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter message to be encrypted: ");
		message=sc.nextLine();

		System.out.println("Enter ecryptionKey: ");
		key=sc.nextInt();

		int mssglngth=message.length();

		for (int i=0;i<message.length() ; i++) {

			ch=message.charAt(i);

			if (ch>='a' && ch<= 'z') {
				ch=(char)(ch+key);

				if (ch>'z') {
					ch=(char)(ch-'z'+'a'-1);
				}
				encryptedMessage+=ch;
			}

			else if (ch>='A' && ch<= 'Z') {
				ch=(char)(ch+key);

				if (ch>'Z') {
					ch=(char)(ch-'Z'+'A'-1);
				}
				encryptedMessage+=ch;
			}

			else {encryptedMessage+=ch;
			}
		}

		System.out.println("Encrypted message = " + encryptedMessage);
	}

}