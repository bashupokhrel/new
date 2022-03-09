import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		System.out.print("Please enter a sentence: " );
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			
			int total =0;
			for (int i = 0; i<str.length(); i++) {
				char chara = str.charAt(i);
				if(chara == 'a'|| chara == 'A' ||chara== 'e'||chara== 'E'||chara== 'i'||chara== 'I'||chara== 'o'||chara== 'O'||chara== 'u'||chara== 'U') {
				System.out.print("");
				}
				else if (chara != ' ') {
					
				
					total ++;
				
			}
			}

			System.out.println("You have " + total + " consonants in your sentence.");
		}
	}
}


