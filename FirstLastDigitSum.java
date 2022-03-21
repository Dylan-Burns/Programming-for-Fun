//INSTRUCTIONS

//Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//
//        The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
//
//        If the number is negative then the method needs to return -1 to indicate an invalid value.
//
//        Example input/output
//
//        * sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
//
//        * sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
//
//        * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
//
//        * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
//
//        * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
//
//
//        NOTE: The method sumFirstAndLastDigit needs to be defined as public static like we have been doing so far in the course.
//
//        NOTE: Do not add a  main method to solution code.

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        //extracts the last digit of the number (remainder of modulo 10)
        //ex: 121 % 10 == 1
        int lastDigit = number % 10;
        System.out.println("last digit = " + lastDigit);
        //initialize firstDigit variable to lastDigit so if the number is less than 10, it is assigned the same value
        int firstDigit = lastDigit;
        while (number != 0) {
            //removes the last digit on the number
            //ex: 121/10 == 12 -> 12/10 == 1
            number /= 10;
            if(number % 10 == 0)
                break;
            //assign the first digit of the number to firstDigit variable once there is
            //a single digit left. When a single digit is left ( 1 - 9 ) the conditional
            //statement number / 10 == 0 will evaluate to true since any digit 1-9 divided by
            //10 will return less than one, and an int value will return 0.
            //ex: 1/10==0, 2/10==0, ...., 9/10==0
            firstDigit = number;

        }
        System.out.println("first digit = " + firstDigit);
        sum = lastDigit + firstDigit;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of the first and last digit of 828 is = " + sumFirstAndLastDigit(828));
        System.out.println("The sum of the first and last digit of 98 is = " + sumFirstAndLastDigit(98));
        System.out.println("The sum of the first and last digit of 5 is = " + sumFirstAndLastDigit(5));
        System.out.println("The sum of the first and last digit of -3 is = " + sumFirstAndLastDigit(-30));
        System.out.println("The sum of the first and last digit of -3 is = " + sumFirstAndLastDigit(-3));
        System.out.println("The sum of the first and last digit of -47 is = " + sumFirstAndLastDigit(-47));
    }
}
