//this program takes a string input and asks the user for
//starting and ending indexes to extract a substring

import java.util.Scanner;

public class ExtractASubstring {
    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a String: ");
            String str = scanner.nextLine();
            System.out.println("Enter the starting index #: ");
            int rangeStart = scanner.nextInt();
            System.out.println("Enter the ending index #: ");
            int rangeEnd = scanner.nextInt();

            System.out.println(str.substring(rangeStart, rangeEnd + 1));
        }
    }
}
