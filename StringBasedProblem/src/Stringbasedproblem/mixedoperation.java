package Stringbasedproblem;
import java.util.Scanner;
public class mixedoperation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		 int out = str.charAt(0) - '0';
		for(int i=str.length()/2;i<str.length();i++) {
			{
				switch(str.charAt(i)) {
				case '-':{
					int val = str.charAt(i-str.length()/2)-'0';
					out -= val;	
				}
				break;
				case '+':{
					int val = str.charAt(i-str.length()/2)-'0';
					out += val;	
				}
				break;
				case '*':{
					int val = str.charAt(i-str.length()/2)-'0';
					out *= val;	
				}
				break;
				case '/':{
					int val = str.charAt(i-str.length()/2)-'0';
					out /= val;	
				}
				break;
				}
				
				
			}
			
		}
		System.out.println(out);	
		
		
	}

}
