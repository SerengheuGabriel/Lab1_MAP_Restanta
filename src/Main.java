import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int sumInts = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int numberInts = keyboard.nextInt();
        for(int i = 0; i<numberInts; i++) {
            sumInts += keyboard.nextInt();
        }
        System.out.println(sumInts / numberInts);
    }
}