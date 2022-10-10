import java.util.Scanner;

/**
 * recursionStart
 */
public class recursionStart {

    public static void main(String[] args) {
        System.out.print("Enter 1 to Print numbers from n to 1 using reursion. \nEnter 2 to print numbers from 1 to n. \nEnter 3 to print factioral of a number n. \n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            // Q1. Print numbers from n to 1.
            System.out.println("Enter Number: ");
            int num = sc.nextInt();
            printNto1(num);
        } else if(choice == 2){
            // Q2. Print numbers from 1 to 5.
            System.out.println("Enter Number: ");
            int num = sc.nextInt();
            print1toN(1,num);
        } else if(choice == 3){
            // Print factorial of a number n.
            int num = sc.nextInt();
            factInt(num, 1);
        }

        
    }
    
    public static void printNto1(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }

    private static void print1toN(int i,int n) {
        if(i>n){
            return;
        }
        System.out.println(i);
        print1toN(i+=1,n);
    }

    private static void factInt(int num, int facto) {
        if (num==0) {
            System.out.println(facto);
            return;
        }
        facto *= num;
        factInt(num-1, facto);
    }
}