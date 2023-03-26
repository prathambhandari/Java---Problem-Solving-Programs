import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the value :");
            int n = in.nextInt();

            int count = 0;
            while (n > 0) {
                int rem = n % 10;
                if (rem == 2) {
                    count++;
                }
                n = n / 10;
            }
            System.out.print("Repeated times :");
            System.out.println(count);
        }
    }

}
