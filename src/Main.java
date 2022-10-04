import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int s = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int n = keyboard.nextInt();
        for(int i = 0; i<n; i++) {
            s += keyboard.nextInt();
        }
        System.out.println(s / n);
    }
}