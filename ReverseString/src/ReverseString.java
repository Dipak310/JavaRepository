import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		String inputStr;
		/* If You want to hardcode the value of string then please uncomment the line below. */
		
//		String inputStr = "Infoway Technology";  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to Reverse: ");
		inputStr = sc.nextLine(); 
		
		String[] str = inputStr.split("");
		String revStr = "";
		for(int i=inputStr.length()-1;i>=0;i--) {
			revStr = revStr + str[i];
		}
		System.out.println(revStr);
	}
}
