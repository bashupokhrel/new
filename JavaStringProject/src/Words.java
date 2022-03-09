import java.util.Scanner;
public class Words {

	public static void main(String[] args) {
		
		System.out.print("Please enter a sentence: " );
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			
			int word = 1;
			
			for (int i =0; i<str.length()-1; i++ ) {
				if ((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
				{
					word++;
				}
			}
			
			System.out.println("You have " + word + " word(s)in your sentence." );
		}
	}

}
