//INSTRUCTIONS
//
// Read an integer number N from the input and print all the squares of positive integers:
//
//less than or equal to N,
//in ascending order.
// Report a typo
// See hint
//Sample Input 1:
//
//50
//Sample Output 1:
//
//1
//4
//9
//16
//25
//36
//49

import java.util.Scanner;

public class Squares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextInt();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            System.out.println((int) Math.pow(i, 2));
        }
    }
}
