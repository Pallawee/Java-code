import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number : ");
        int num = input.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("The num is even");
        }
        else {
            System.out.println("The num is odd");
        }
    }
}
