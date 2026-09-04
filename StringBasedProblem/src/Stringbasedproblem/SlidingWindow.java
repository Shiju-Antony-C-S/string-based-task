package Stringbasedproblem;
import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine(); 
        String str2 = in.nextLine();

        int windowSize = str2.length(); 

       
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            String ch = "";
            for (int j = i; j < i + str2.length(); j++) {
                ch += str1.charAt(j);
            }
            System.out.println(ch);
        }

        in.close();
    }
}
