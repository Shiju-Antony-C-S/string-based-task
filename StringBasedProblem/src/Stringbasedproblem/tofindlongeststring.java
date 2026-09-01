package Stringbasedproblem;
import java.util.Scanner;
public class tofindlongeststring {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] strarr	= str.split(" ");
		in.close();
		String longest = "";
		for (String word :strarr) {
			if(word.length()>longest.length()) {
			 longest = word;
		}
		}
		System.out.print("Logest word is "+ longest + " "+ longest.length() );
		
		
	}
}
