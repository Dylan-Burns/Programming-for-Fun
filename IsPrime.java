//INSTRUCTIONS

//create a for statement using any range of numbers.
///determine if the number is prime using the IsPrime() method.
//if it is a prime number, print it out and increment a count of the
//number of prime numbers found
//if that count is 3, exit the for loop.
//HINT: use a break; statement to exit.

public class IsPrime {
    public static void main(String[] args) {

        int count = 0;
        for(int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("The number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    //REMINDER: methods cannot go inside the main method. don't do it bro

    //this code determines if a number is a prime or not
    public static boolean isPrime(int n){
        //prime cannot be 1 because primes must be divisible by 1
        if (n == 1){
            return false;
        }
        //speed the algorithm up by removing numbers divisible by 2 since they aren't prime.
        //A prime number is a number that is only divisible by 1 and itself, therefore if the
        //number is divisible by 2 it is not prime
        //NOTE: we could also use Math.sqrt(2) instead of n/2 to speed up the algo
        for(int i = 2; i <= n/2; i++){
            //if the remainder is 0 it means we found another number that divides evenly into the number
            //thus meaning the number itself and 1 are not its only factors.
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

}
