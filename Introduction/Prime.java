package Introduction;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        //int num = 100;
        int i = 2;
        //for(i=2;i<=num;i++){
        while (num > i) {
            if (num % i == 0)
            {
                System.out.println("The no is not prime");
                break;
            } else {
                i++;
                System.out.println("The no is Prime");
                    }
            }
        }
}


