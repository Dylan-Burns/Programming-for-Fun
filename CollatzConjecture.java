//INSTRUCTIONS

//Given natural number n, generate a sequence of integers, described in the Collatz conjecture:
//
//If n is an even number, divide it in half; if it is odd, multiply it by 3 and add 1. Repeat this operation until
//we get the number 1 as a result.
//
//For example, if the number n = 17, then the sequence looks as the following:
//
//17 52 26 13 40 20 10 5 16 8 4 2 1
//Such a sequence will stop at number 1 for any initial natural number n.
//
//Output format:
//Sequence of integers in a single line, separated by spaces.

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final int magicNum = 3;
        System.out.print(n + " ");
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n = n * magicNum + 1;
            }
            System.out.print(n + " ");
        }
    }
}
