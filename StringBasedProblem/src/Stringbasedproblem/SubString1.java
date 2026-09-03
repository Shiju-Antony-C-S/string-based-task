package Stringbasedproblem;
import java.util.Scanner;
public class SubString1 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	String str1 = in.nextLine();
	for(int k =0;k<str.length();k++)
	{
	for(int i =k ;i<str.length();i++)	
	{
		String emp ="";
		for(int j =k;j<=i;j++) {
			emp +=str.charAt(j);
		}
		System.out.println("");
		if (emp.equals(str1)) {
	    	System.out.print("is a substring");
	    	return;
	    }
	}
    
	}
	System.out.print("not a sub string");
	
	}
}


