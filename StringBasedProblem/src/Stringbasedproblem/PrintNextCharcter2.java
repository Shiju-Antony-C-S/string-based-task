package Stringbasedproblem;
import java.util.Scanner;
public class PrintNextCharcter2  {
	    static String reverseString(String str){
	    String empStr="";
	       for(int i=0;i<str.length();i++){
	           int val = (str.charAt(i) - 97 )+1;
	           int div = ((val%26)+1)+96;
	           empStr+=((char)(div));
	           
	       }
	       return empStr;
	    }
		public static void main(String[] args) {
			System.out.print("Enter the sequence of character");
			Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			System.out.println(PrintNextCharcter2.reverseString(str));
			in.close();
			}
	}
