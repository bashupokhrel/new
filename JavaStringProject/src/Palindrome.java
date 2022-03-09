import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		String initial = "";
		String later = "";
		Scanner sc = new Scanner(System.in);{
	
		System.out.print("Please enter a sentence or a word: ");
		initial = sc.nextLine();
		
	
		int length = initial.length();
		for (int i = length-1; i>=0; i--)
			later =later + initial.charAt(i);
		if(initial.equals(later))
			System.out.println("The string you entered is palindrome.");
		else
			
			System.out.println("The string you entered is NOT palindrome.");	
		}
	}
}
				
		
	


