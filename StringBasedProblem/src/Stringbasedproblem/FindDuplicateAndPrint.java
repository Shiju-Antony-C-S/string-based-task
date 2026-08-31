package Stringbasedproblem;
import java.util.Scanner;
public class FindDuplicateAndPrint {
	public static void main(String[] args) {
		System.out.print("Enter the String");	
		Scanner in = new Scanner(System.in);
		String str =in.nextLine();
		
		for(int i =0;i<str.length();i++) {
			boolean t = false;
			for(int j = i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					t = true;
					break;
				}
			}
			if (!t) {
                int count = 0;
                for (int k = 0; k < str.length(); k++) {
                    if (str.charAt(i) == str.charAt(k)) {
                        count++;
                    }
                }
                System.out.println(str.charAt(i) + " -> " + count);
            }
			}
			
		}
	}	

