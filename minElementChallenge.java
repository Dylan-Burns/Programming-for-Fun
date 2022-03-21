
import java.util.Scanner;

public class minElementChallenge {
    private static final Scanner scanner = new Scanner(System.in);

    private static int readInteger() {
        return scanner.nextInt();
    }

    private static int[] readElements(int count){
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }


    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min  = value;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int count = readInteger();
        int[] returnedArray = readElements(count);
        System.out.println(findMin(returnedArray));
    }
}


//import java.util.Scanner;
//
//public class minElementChallenge {
//    private static final Scanner scanner = new Scanner(System.in);
//    public static int[] readIntegers(int count) {
//        int[] arr = new int[count];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        return arr;
//    }
//
//    public static int findMin(int[] array) {
//        int min = Integer.MAX_VALUE;
//        for (int value : array) {
//            if (value < min) {
//                min  = value;
//            }
//        }
//        return min;
//    }
//

//
//
//    }
//}

