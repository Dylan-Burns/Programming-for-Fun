//INSTRUCTIONS

//write a method evenDigitSum that takes one parameter of type int named number
//this method should count the even numbers in the range of 0 - number and print out the numbers
//number needs to be greater than 0 (number > 0), otherwise return -1;
//print out the numbers in the range of the given number in readable format

public class EvenDigitSumModified {
    public static String evenDigitSum(int number){
        //initialize variable sum to hold the value of numbers between 0 and the value of the number given
        int sum = 0;
        //while loop that iterates until the even numbers add to the same value as the number given
        int evenNum = 0;
        while(sum < number){
           //for loop that adds even numbers to sum
            for(int i = 0; i < number; i++){

                if(i % 2 == 0){
                    evenNum = i;
                    System.out.println("Even number = " + evenNum);
                    sum += i;

                }
                if(sum == number){
                    return "Sum of = " + sum;
                }
            }
        }return "sum " + sum;
    }

    // public static String evenDigitSum(int number){
    //        //initialize variable sum to hold the value of numbers between 0 and the value of the number given
    //        int sum = 0;
    //        //while loop that iterates until the even numbers add to the same value as the number given
    //        int evenNum = 0;
    //        while(sum < number){
    //           //for loop that adds even numbers to sum
    //            for(int i = 0; i < number; i++){
    //
    //                if(i % 2 == 0){
    //                    evenNum = i;
    //                    System.out.println("Even number = " + evenNum);
    //                    sum += i;
    //
    //                }
    //                if(sum == number){
    //                    return "Sum  of = " + sum;
    //                }
    //            }
    //        }return "sum " + sum;
    //    }


    public static void main(String[] args) {
        System.out.println(evenDigitSum(20));
        System.out.println(evenDigitSum(14));
    }
    //NOTES
    //STEP 1:
}
