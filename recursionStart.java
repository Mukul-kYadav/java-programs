import java.util.Scanner;

/**
 * recursionStart
 */
public class recursionStart {

    public static void main(String[] args) {
        System.out.println("Enter 1 to Print numbers from n to 1 using reursion. \n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            // Q1. Print numbers from n to 1.
            System.out.println("Enter Number: ");
            int num = sc.nextInt();
            printNto1(num);
        }

        
    }
    public static void printNto1(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        n-=1;
        printNto1(n);
    }
}