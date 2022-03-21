import java.util.Scanner;

public class TimeDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int sec1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int sec2 = scanner.nextInt();

        int h = hour2 - hour1;
        int  m = min2 - min1;
        int s = sec2 - sec1;

        h *= 3600;
        m *= 60;
        int totalSeconds = h + m + s;
        System.out.println(totalSeconds);
    }
}