//INSTRUCTIONS

//Write a method called isPalindrome with one int parameter called number.
//
//The method needs to return a boolean.
//
//It should return true if the number is a palindrome number otherwise it should return false.
//
//Check the tips below for more info about palindromes.
//
//Example Input/Output
//
//isPalindrome(-1221); → should return true
//
//isPalindrome(707); → should return true
//
//isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
//
//Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.
//
//Tip: Logic to check a palindrome number
//
//Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
//
//If both are the the same then the number is a palindrome otherwise it is not.
//
//Tip: Logic to reverse a number
//
//Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
//
//Extract the last digit of the given number by performing the modulo division (remainder).
//Store the last digit to some variable say lastDigit = num % 10.
//Increase the place value of reverse by one.
//To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
//Add lastDigit to reverse.
//Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
//Repeat steps until number is not equal to (or greater than) zero.
//
//A while loop would be good for this coding exercise.
//
//
//Tip: Be careful with negative numbers. They can also be palindrome numbers.
//
//Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).
//
//NOTE: The method isPalindrome needs to be defined as public static like we have been doing

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        //store original number for later comparison to reverse int
        int originalNumber = number;
        //initialize variable to hold digits extracted from the end of the number
        int reverse = 0;
        while(number != 0) {
            //extract the last digit...ex: 123 % 10 == 3...
            int lastDigit = number % 10;
            //increase the place value of the reverse number. ex: reverse = 1 -> 01 * 10 = 10
            reverse = reverse * 10;
            //add last digit to reverse variable
            reverse += lastDigit;
            //update the number and remove the lat digit extracted
            number /= 10;
        }
        return originalNumber == reverse;
    }
    //NOTES
    //STEP 1: number % 10 -> 1221 % 10 == 1
    //STEP 2: reverse += 1 -> reverse == 1
    //STEP 3: reverse = reverse * 10 -> 1 * 10 == 10
    //STEP 4: number /= 10 -> 1221 / 10 == 122
    //STEP 5: lastDigit = number % 10 -> 122 % 10 == 2
    //STEP 6: reverse += lastDigit -> 12
    //STEP 7: reverse = reverse * 10 -> 12 * 10 == 120
    //STEP 8: number /= 10 -> 122 / 10 == 12
    //STEP 9: lastDigit = number % 10 -> 12 % 10 == 2
    //STEP 10: reverse += lastDigit -> 120 + 2 == 122
    //STEP 11: reverse = reverse  * 10 == 1220
    //STEP 12: number /= 10 -> 12 / 10 == 1
    //STEP 13: reverse += lastDigit -> 1220 + 1
    //STEP 14: reverse = reverse * 10 -> 1221
    //STEP 15; number /= 10 -> 1 / 10 == 0
    //STEP 16: while loop condition evaluates to FALSE thus ending the loop
    //STEP 16: compare originalNumber to reverse to return TRUE or FALSE
    //STEP 17: return originalNumber == reverse -> 1221 == 1221 -> returns TRUE

    public static void main(String[] args) {
        System.out.println("Is the number 11 a palindrome? -> " + isPalindrome(11));
        System.out.println("Is the number 121 a palindrome? -> " + isPalindrome(121));
        System.out.println("Is the number 1441 a palindrome? -> " + isPalindrome(1441));
        System.out.println("Is the number -2112 a palindrome? -> " + isPalindrome(-2112));
        System.out.println("Is the number 44555544 a palindrome? -> " + isPalindrome(44555544));
        System.out.println("Is the number 1234 a palindrome? -> " + isPalindrome(1234));

    }
}
