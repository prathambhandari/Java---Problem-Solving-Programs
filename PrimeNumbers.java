import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int c = 2;
        if(num <=1){
            System.out.println("Invalid input");
        }
        while (c < num){
            if(num % c == 0){
                System.out.println("not prime");
                return;
            }
            c++;
        }
        System.out.println("Prime");
    }
}
