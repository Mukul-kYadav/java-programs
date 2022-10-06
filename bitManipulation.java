import java.util.*;

public class bitManipulation {
    public static void main(String[] args) {
        System.out.println("Enter 1 to check whether a number is power of 2 or not: \n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice==1){
            // Write a program to find if a number is a power of 2 or not.
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if((num & (num-1)) != 0){
                System.out.println("Number " +num+" is not a power of two.");
            }
            else{
                System.out.println("Number " +num+" is a power of two");
            }
        }
    }
}
