import java.util.Scanner;

/**
 * recursionStart
 */
public class recursionStart {

    public static void main(String[] args) {
        System.out.print("Enter 1 to print numbers from n to 1 using reursion. \nEnter 2 to print numbers from 1 to n. \nEnter 3 to print factioral of a number n. \nEnter 4 to print sum of first n natural numbers. \nEnter 5 to print the fibonacci sequence till nth term. \nEnter 6 to print x^n (with stack height = n) class Recursion1 \nEnter 7 to print x^n (with stack height = logn) class Recursion1\n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            // Q1. Print numbers from n to 1.
            printNto1(inputNum());
        } else if(choice == 2){
            // Q2. Print numbers from 1 to 5.
            print1toN(1,inputNum());
        } else if(choice == 3){
            // Q3. Print factorial of a number n.
            factInt(inputNum(), 1);
        } else if(choice == 4){
            // Q4. Print the sum of first n natural numbers.
            sumN(0,inputNum());
        } else if(choice == 5){
            // Q5. Print the fibonacci sequence till nth term.
            System.out.println(fiboN(inputNum()));
        } else if(choice == 6){
            // Q6. Print x^n (with stack height = n) class Recursion1
            
        } else if(choice == 5){
            // Q7. Print x^n (with stack height = logn) class Recursion1
            
        } else {
            System.out.println("Invalid Choice");
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
    public static void print1toN(int i,int n) {
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
    public static void sumN(int i, int n){
        if(n==0){
            System.out.println(i);
            return;
        }
        i+=n;
        sumN(i, n-1);   
    }
    // 5
    public static int fiboN(int n) {
        if(n<=2){
            if (n==1){
                return 0;
            }
            else if(n==2){
                return 1;
            }
            
        }
        fiboN(n-1);
        return fiboN(n-1)+fiboN(n-2);
    }
}