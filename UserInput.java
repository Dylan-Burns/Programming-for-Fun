import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//INSTRUCTIONS

//read 10 numbers from the console entered by the user and print the sum of those numbers
//create a Scanner
//use the hasNextInt() method from the scanner to check if the user has entered an int value
//if hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have 10 numbers.
//use the nextInt() method to get the number and add it to the sum
//before the user enters each number, print the message "Enter number #x:"where x represents the count,
// i.e. 1, 2, 3, 4, etc
//For example the first message printed to the user would be "Enter number #1:", then "Enter number #2:", and so on.

//Hint:
//use a while loop
//use a counter variable for counting valid numbers
//close the scanner after you don't need it anymore

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while(true){
            int order = count + 1;
            System.out.println("Enter number # " + order + " : ");

            boolean hasNextInt = scanner.hasNextInt();//continues if next int is an int, otherwise returns false
            if(hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                if(count == 10) break;

            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handle next line character (enter key)
        }
        System.out.println("Sum of numbers: " + sum);
        scanner.close();

    }


}
