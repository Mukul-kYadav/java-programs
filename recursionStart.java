import java.util.Scanner;

/**
 * recursionStart
 */
public class recursionStart {

    public static void main(String[] args) {
        System.out.print("Enter 1 to Print numbers from n to 1 using reursion. \nEnter 2 to print numbers from 1 to n. \nEnter 3 to print factioral of a number n. \nEnter 4 to print sum of first n natural numbers. \n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            // Q1. Print numbers from n to 1.
            printNto1(inputNum());
        } else if(choice == 2){
            // Q2. Print numbers from 1 to 5.
            int num = inputNum();
            print1toN(1,num);
        } else if(choice == 3){
            // Q3. Print factorial of a number n.
            int num = inputNum();
            factInt(num, 1);
        } else if(choice == 4){
            // Q4. Print the sum of first n natural numbers.
            int num = inputNum();
            sumN(0,num);
        } else if(choice == 5){
            // Q5. Print the fibonacci sequence till nth term.
            int num = inputNum();
        }

        
    }

    // function to take input n
    public static int inputNum() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = inp.nextInt();
        return num;
    }
    
    // 1
    public static void printNto1(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
    // 2
    private static void print1toN(int i,int n) {
        if(i>n){
            return;
        }
        System.out.println(i);
        print1toN(i+=1,n);
    }
    // 3
    private static void factInt(int num, int facto) {
        if (num==0) {
            System.out.println(facto);
            return;
        }
        facto *= num;
        factInt(num-1, facto);
    }
    // 4
    private static void sumN(int i, int n){
        if(n==0){
            System.out.println(i);
            return;
        }
        i+=n;
        sumN(i, n-1);
        
    }
}