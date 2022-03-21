//INSTRUCTIONS

//write a method with the name sumDigits hat has one int parameter called number
//if parameter is >= 10 then the method should process that number and return
//the sum of all the digits, otherwise return -1 to indicate an invalid value
//the numbers 0-9 have 1 digits, so we won't want to process them, also we don't want
//to process negative numbers so also return -1 for negative numbers

//for example calling the method sumDigits(125) should return 8 since 1+ 2 + 5 = 8
//calling the method sumDigits(1) should return -1 as per the requirements described above.

public class SumDigits {

    public static void main(String[] args) {
        System.out.println("The sum of the digits 125 is " + sumDigits(125));
        System.out.println("The sum of the digits 126 is " + sumDigits(126));
        System.out.println("The sum of the digits 333 is " + sumDigits(333));
        System.out.println("The sum of the digits 4444 is " + sumDigits(4444));
        System.out.println("The sum of the digits -123 is " + sumDigits(-123));
        System.out.println("The sum of the digits 9999 is " + sumDigits(9999));


    }
    //1234 % 10 == 4...123 % 10 == 3...12 % 10 == 2...2 % 10 == 2
    //

    public static int sumDigits(int number){
           if (number < 10){
               return -1;
           }
            int sum = 0;
            while(number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
                }
//                int firstDigit = number % 10;
//                int newFirstNumber = number / 10;
//                int secondDigit = newFirstNumber % 10;
//                int newSecondNumber = newFirstNumber / 10;
//                int thirdDigit = newSecondNumber % 10;
//                sum += firstDigit + secondDigit + thirdDigit;
                return sum;
            }
    }


    //runs clean with ay 3 digit integer
//    public static int sumDigits(int number){
//        int sum = 0;
//        while(number >= 10) {
//            int firstDigit = number % 10;
//            int newFirstNumber = number / 10;
//            int secondDigit = newFirstNumber % 10;
//            int newSecondNumber = newFirstNumber / 10;
//            int thirdDigit = newSecondNumber % 10;
//            sum += firstDigit + secondDigit + thirdDigit;
//            return sum;
//        }
//        return -1;
//    }


//NOTE
// sumDigit(125) -> STEP 1: 125 % 10 == 5.....STEP 2: 125 / 10 == 12....STEP 3: 12 % 10 == 2....
//STEP 4: 12 / 10 == 1...STEP 5:

