import java.util.Scanner;


/**
 * functions
 */
public class functions {

    // Enter 3 numbers from the user & make a function to print their average.
    public static int average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    // Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                sum += 0;
            } else {
                sum += i;

            }

        }
        return sum;

    }

    //Write a function which takes in 2 numbers and returns the greater of those two.
    public static int greatest(int a, int b) {
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    //Write a function that takes in the radius as input and returns the circumference of a circle.
    public static double circumference(Double r) {
        double pi = 3.1415;
        double circumference = 2*pi*r;
        return circumference;
    }

    //Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static boolean eligibility(int age) {
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }

    //Write an infinite loop using do while condition.
    public static void infiniteLoop() {
        int i =0;
        do {
            System.out.println("+");
        } while (i<1);
    }

    //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    public static void justType() {
        int a=0, b=0, c=0;
        System.out.println("How many times you want to Enter numbers: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter Number: ");
            int num = scan.nextInt();
            if(num > 0){
                a++;
            }
            else if(num < 0){
                b++;
            }
            else{
                c++;
            }
        }
        System.out.println("Numbers of positive numbers entered is: " + a + "\nNumbers of negative numbers entered is: " + b + "\nNumbers of zeroes is: " + c);
    }

    //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥^n.
    //done

    //Write a function that calculates the Greatest Common Divisor of 2 numbers.
    //done

    //Write a program to print Fibonacci series of n terms where n is input by user
    //done

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for average of three numbers:");
        System.out.println("Enter 2 for sum of all odd numbers from 1 to n:");
        System.out.println("Enter 3 for finding greatest of two numbers: ");
        System.out.println("Enter 4 to calculate circumference of a circle: ");
        System.out.println("Enter 5 to check eligibility of a person for voting: ");
        System.out.println("Enter 6 to run an infinite loop using do while looop: ");
        System.out.println("Enter 7 to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.");
        System.out.println("Enter 8 to find x raise to the power y: ");
        System.out.println("Enter 9 to Find greatest common divisor of two numbers: ");
        System.out.println("Enter 10 to print fibonacci series upto a certain number.");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter three numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("average of these three numbers are:");
            int avg = average(a, b, c);
            System.out.println(avg);
        }
        else if(choice == 2){
            System.out.println("Enter n:");
            int d = sc.nextInt();
            int sumodd = sumOdd(d);
            System.out.println("sum of all odd numbers from 1 to n is," + sumodd);
        }
        else if(choice == 3){
            System.out.println("Enter two numbers: ");
            int e = sc.nextInt();
            int f = sc.nextInt();
            System.out.println("greatest of these two numbers is: " + greatest(e, f));
        }
        else if(choice == 4){
            System.out.println("Enter radius of the circle: ");
            Double g = sc.nextDouble();
            System.out.println("Circumference of the circle is: " + circumference(g));
        }
        else if(choice == 5){
            System.out.println("Enter age of the person: ");
            int age = sc.nextInt();
            boolean eligible = eligibility(age);
            if(eligible == true){
                System.out.println("Congratulations! You are eligible for voting.");
            }
            else{
                System.out.println("Sorry! you are not eligible for voting.");
            }
        }
        else if(choice == 6){
            infiniteLoop();
        }
        else if(choice == 7){
            justType();
        }
        else if(choice == 8){
            System.out.println("Enter x : ");
            int h = sc.nextInt();
            System.out.println("Enter y : ");
            int k = sc.nextInt();
            int pow=1;
            for(int i =1; i<=k; i++){
                pow = pow*h;
            }
            System.out.println("X to the pwr Y is: " + pow);
        }
        else if(choice == 9){
            System.out.println("Enter first number:");
            int l = sc.nextInt();
            System.out.println("Enter second number:");
            int m = sc.nextInt();
            int gcd = 1;
            for(int i=1; i<=l && i<=m; i++){
                if(m%i==0 && l%i==0){
                    gcd = i;
                }
            }
            System.out.println("Greatest Common Divisor is: " + gcd);
        }
        else if(choice == 10){
            System.out.println("Enter length(n) of fib series: ");
            int len = sc.nextInt();
            int arr[];
            arr = new int[100];
            System.out.print("Fibonacci Series is: ");
            arr[0]= 0;
            System.out.print(arr[0] + ", ");
            arr[1]=1;
            System.out.print(arr[1] + ", ");
            
            for(int i=2; i<len; i++){
                arr[i]= arr[i-1]+arr[i-2];
                System.out.print(arr[i] + ", ");
            }
        }
    }
}