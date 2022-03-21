//INSTRUCTIONS

//read the numbers from the console entered by the user and print the minimum and maximum
//number the user has entered.
//before the user enters the number, print the message "Enter Number: "
//if the user enters an invalid number, break out of the loop and print the minimum and
//maximum number.

//HINT
//use an endless while loop

//BONUS
//create a project with the name MinAndMaxInputChallenge

import java.util.Scanner;

public class MinMax {
    //create scanner object
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int number = 0;
        boolean first = true;

        while(true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                number = scanner.nextInt();
                if(first){
                    first = false;
                    min = number;
                    max = number;
                }
                if(number > max) {
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            } else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min= " + min + ", Max= " + max);
        scanner.close();
    }
}
