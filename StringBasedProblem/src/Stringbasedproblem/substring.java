package Stringbasedproblem;
import java.util.Scanner;

public class substring {
    static int longestSubString(String str) {
        int max = 0;

        // Outer loop: starting index
        for (int i = 0; i < str.length(); i++) {
            int sum = 0;

            // Inner loop: ending index
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    sum++;
                } else {
                    sum--;
                }

                // If equal number of 1s and 0s
                if (sum == 0) {
                    int length = j - i + 1;
                    if (length > max) {
                        max = length;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(longestSubString(str));
        in.close();
    }
}
