//INSTRUCTIONS

//Write a method named hasSameLastDigit with three parameters of type int.
//
//Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
//
//
//EXAMPLE INPUT/OUTPUT:
//
//* hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
//
//* hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
//
//* hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000
//
//
//Write another method named isValid with one parameter of type int.
//
//The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
//
//EXAMPLE INPUT/OUTPUT
//
//* isValid(10); → should return true since 10 is within the range of 10-1000
//
//* isValid(468); → should return true since 468 is within the range of 10-1000
//
//* isValid(1051); → should return false since 1051 is not within the range of 10-1000
//
//
//NOTE: All methods need to be defined as public static as we have been doing so far in the course.
//
//NOTE: Do not add a main method to the solution code.

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || c > 1000))
            return false;
        int lastDigitA =  a % 10;
        int lastDigitB =  b % 10;
        int lastDigitC =  c % 10;

        return lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC;
    }

    public static boolean isValid(int a){
        return (a >= 10 && a <= 1000);
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
    //CASE 1:
    //12 23 34
    //2 3 4
    // 2== 3 || 2 = 4 ||

    //CASE 2:
    //12 32 54
    //2 2 4
    //2==2 || 2==4

    //CASE 3:
    //23 24 43
    //3 4 3
    // 3==4 || 3==3
}
