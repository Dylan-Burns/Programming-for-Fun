import java.util.Scanner;

public class UnorderedSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ordered = true;
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a >= b){
                continue;
            }

                if(scanner.nextInt() == 0){
                    System.out.println(ordered);
                    break;
                }
        }
    }
}
