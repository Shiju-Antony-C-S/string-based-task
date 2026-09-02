package Stringbasedproblem;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		char[] character1 = str1.toCharArray();
		char[] character2 = str2.toCharArray();
		  for (int i = 0; i < character1.length; i++) 
		  {
	            for (int j = i + 1; j < character1.length; j++) 
	            {
	                if (character1[i] > character1[j]) 
	                {
	                    char temp = character1[i];
	                    character1[i] = character1[j];
	                    character1[j] = temp;
	                }
	            }
	        }
		  for (int i = 0; i < character2.length; i++) 
		  {
	            for (int j = i + 1; j < character2.length; j++) 
	            {	
	                if (character2[i] > character2[j]) 
	                {
	                    char temp = character2[i];
	                    character2[i] = character2[j];
	                    character2[j] = temp;
	                }
	            }
	        }
		  boolean isAnagram = true;
	        if (character1.length != character2.length) 
	        {
	            isAnagram = false;
	        } 
	        else 
	        {
        for (int i = 0; i < character1.length; i++)
        {
            if (character1[i] != character2[i]) 
            {
                isAnagram = false;
                break;
            }
                   }
        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

    }
    in.close();
	}
	
	
			
}
