//INSTRUCTIONS

//create a method called isEvenNumber that takes a parameter of type int
//its purpose is to determine if the argument passed to the method is
//an even number or not
//return true if an even number, otherwise return false

public class EvenNumber {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(1));
        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(3));
        System.out.println(isEvenNumber(6));

        int count = 0;
        int startNum = 4;
        int finishNum = 20;
        while(startNum <= finishNum){
            startNum++;
            if(!isEvenNumber(startNum)){
                continue;
            }
            count++;
            System.out.println("Even number = " + startNum);
            if(count == 5){
                System.out.println("Count = " + count);
                break;

            }


        }


    }


    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

}
