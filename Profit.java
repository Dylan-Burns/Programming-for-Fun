//INSTRUCTIONS

//Ann puts M money in the bank. The bank increases Ann's deposit by P percent every year.
//Ann wants to know how many years should pass until her deposit in the bank reaches K money.
//Can you help her to answer this question?
//
//The input contains three integers M, P, K. It is guaranteed that all numbers are positive and K ≥ M.
//
//Output the answer to Ann's question.
//

import java.util.Scanner;

class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double m = scanner.nextInt();
        final float p = (float) scanner.nextInt() / 100;
        final double k = scanner.nextInt();

        //initialize counter variable
        int count = 0;
        while (m < k) {
            //add interest times principle to original investment
            m += m * p; //money = money * interest
            count++;
            if (m >= k) { // if money >= target
                break;
            }
        }
        //print years till target money is reached
        System.out.println(count);


    }
}