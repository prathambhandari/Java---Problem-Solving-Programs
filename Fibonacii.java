import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int pre = 0;
        int cur = 1;
        int count = 2;
        while (count < num) {
            int temp = cur;
            cur = cur + pre;
            pre = temp;
            count++;
        }
        System.out.println(cur);

    }
}