//this program determines if the box dimensions provided by the user
//allow one box to be placed inside th eother box.

//the boxes are either compatible or not. IF not compatible the program
//outputs which box is larger

import java.util.*;

public class Boxes {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];

        for (int i = 0; i < 3; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            box2[i] = scanner.nextInt();
        }

        int a = 0;
        int b = 0;
        for (int i = 0; i < 3; i++) {
            if(box1[i] > box2[i]) {
                a++;
            } else {
                b++;
            }
        }

        if (a == 3) {
            System.out.println("Box 1 > Box 2");
        } else if (b == 3) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}
