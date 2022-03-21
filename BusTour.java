//this program takes input from the user in the form of the
//bus height and bridge height to determine if the bus
//will be able to drive under the bridge, or crash into it

import java.util.Scanner;

public class BusTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int amount = scanner.nextInt();
        int i = 0;
        int bridgeHeight;
        while (i < amount) {
            bridgeHeight = scanner.nextInt();
            if (height >= bridgeHeight) {
                break;
            }
            ++i;
        }
        if (i == amount) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + (i + 1));
        }
    }
}
