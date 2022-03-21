//this program calculates floor space of a given area dependent on the
//shape of the room. The user provides the necessary measurements for
//program calculations

import java.util.Scanner;

public class FloorSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.next();
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double r = Math.PI;






        switch (shape) {
            case "triangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                double p = (a + b + c) / 2;
                double triangleA = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(triangleA);
                break;
            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                double rectangleA = a * b;
                System.out.println(rectangleA);
                break;
            case "circle":
                a = scanner.nextInt();
                double circleA = a * a * r;
                System.out.println(circleA);
                break;
            default:
                break;
        }


    }
}
