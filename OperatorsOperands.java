public class OperatorsOperands {

    public static void main(String[] args) {
        //assign variable result to the value of 1 + 1 which equals 3
        int result = 1 + 2;
        //print out the result using a literal string + the variable result
        //which contains the value of 3 as previously assigned above
        System.out.println("1 + 2 = " + result);
        //assign the variable prevResult to the value of variable result
        int prevResult = result;
        //print a literal string + the variable prevResult which contains the
        //value of the variable result.
        //this is a an example of polymorphism
        System.out.println("previous result = " + prevResult);
        result = result - 1; // =3
        System.out.println("3 - 1 = " + result);
        System.out.println("previous result = "+ prevResult);

        result = result * 10; //2 * 10 == 20

        result = result / 5; //20 / 5 == 4

        //ABBREVIATING OPERATORS

        //addition
        result = result + 1; //4 + 1 == 5
        //abbreviated operator
        result++; //5++ == 6
        //result += 2 would return the value of result + 2

        //subtraction
        result = result -1; //6 - 1 == 5
        //abbreviated
        result--; //5-- == 4
        //result -= 2 would return the value of result - 2

        //multiplication
        result = result * 2; //4 * 2 == 8
        //abbreviated
        result *= 2; //8*= 2 == 16

        //division
        result = result / 2; //16 / 2 == 8
        //abbreviated
        result /= 2; //8 / 2 == 4

        System.out.println("current result = " + result);

        boolean isAlien = false;
        //brackets are not needed because java reads "one line" if statements and considers whitespace!
        //you must add a code block {} if you wish to write more than one life after an if statement
        if (isAlien == false) // can be abbreviated to (!isAlien)
            System.out.println("it is not an Alien!");

        boolean isCar = false;

        if(!isCar)
            System.out.println("isCar is false");

        //the ternary operator is a shortcut to assigning one of two values to a variable depending
        //on a given condition.
        //ternary operator takes 3 values. A condition (isCar), and the typical values of a boolean true and false
        //if the condition is true then the variable wasCar is set to true. If the condition is false, the variable
        //wasCar is set to false.
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        int ageOfClient = 20;
        boolean isEighteenOrOlder = (ageOfClient == 20) ? true : false;


        double value = 20.00d;
        double value1 = 80.00d;
        double value2 = (value + value1) * 100.00d;
        System.out.println("Value total = " + value2);
        double value3 = value2 % 40.00d;
        boolean value4 = (value3 == 0) ? true : false;
        System.out.println("Remainder = " + value4);
        if(!value4)
            System.out.println("Got some remainder");
    }
}
