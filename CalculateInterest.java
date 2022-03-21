public class CalculateInterest {
    public static void main(String[] args) {
        System.out.println(calculateInterest(10000d, 2.0d));

        //iterates in descending order from 8% interest to 2% interest on $10000 using a for loop
        for(double i=8; i >= 2; i--){
            //run this code until the value of i is equal to the length of the object
            System.out.println("Interest rate at " + i + "% interest on $10,000 = $" + String.format("%.2f", calculateInterest(10000, i)));
        }

        //iterates in ascending order from 2% interest to 8% interest on $10,000 using a for loop
        for(double i=2; i < 9; i++){
            //run this code until the value of i is equal to the length of the object
            System.out.println("Interest rate at " + i + "% interest on $10,000 = $" + String.format("%.2f", calculateInterest(10000, i)));
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

}
