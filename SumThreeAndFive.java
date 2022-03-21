//INSTRUCTIONS:
//create a for statement using a range of numbers between 1 and 100.
//SUM all the numbers that can be divided with both 3 and also with 5.
//for those numbers that met the above conditions, print out the number
//BREAK out of the for loop once you find 5 numbers that met the above conditions
//after breaking out of the loop, print the SUM of the numbers that met above conditions
//NOTE: type all code in main method

public class SumThreeAndFive {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i=1; i <=1000; i++){
            if(i % 15 == 0) {
                count ++;
                sum += i;
                System.out.println(i + " is divisible by 3 and 5");
            }
            if(count == 5){
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
