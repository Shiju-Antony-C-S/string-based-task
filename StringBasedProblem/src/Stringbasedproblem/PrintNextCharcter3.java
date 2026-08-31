package Stringbasedproblem;
import java.util.Scanner;
public class PrintNextCharcter3 {
    public static void main(String[] args) {
        System.out.println("Enter the sequence of Characters");    
        Scanner in = new Scanner(System.in);
        String c = in.nextLine();

        for (int i = 0; i < c.length(); i++) {
            char ch = c.charAt(i);

            if (ch == 'z') {
                ch = 'a';
            } else if (ch == 'Z') {
                ch = 'A';
            } else {
                ch = (char)(ch + 1);
            }
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            } else {
                ch = Character.toUpperCase(ch);
            }
            System.out.print(ch);
        }
        in.close();
    }
}