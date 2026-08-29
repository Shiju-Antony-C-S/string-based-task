package Stringbasedproblem;
import java.util.Scanner;
public class ReverseAString {
	public static void main(String[] args) {
		System.out.print("Enter the String");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String empStr="";
		   for(int  i=str.length()-1;i>=0;i--){
	           empStr+=str.charAt(i);
		   }
		   System.out.print(empStr);
		   
		in.close();   
	}

}
