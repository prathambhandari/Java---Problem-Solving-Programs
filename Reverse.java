import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int num = in.nextInt();

            int val = 0;
            if (num > 0) {
                int rem = num % 10;
                num /= 10;
                val = val * 10 + rem;

            }
            System.out.println(val);
        }
    }
}
