import java.util.*;

public class arrays {
    public static void main(String[] args) {
        //Take an array of names as input from the user and print them on the screen.
        System.out.println("Enter 1 to take an array of names as input from the user and print them on the screen.");
        System.out.println("Enter 2 to find max and min number in an array.");
        System.out.println("Enter 3 to check whether an array is sorted in ascending order or not.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("How many names you want to enter ? ");
            int size = sc.nextInt();
            String[] names = new String[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Name: ");
                names[i]= sc.next();
            }
            System.out.println("Names you entered are: ");
            for(int i=0; i<size; i++){
                System.out.println(  names[i]);
            }
        }
        
        // Find the maximum & minimum number in an array of integers.
        else if(choice ==2){
            System.out.println("Enter no. of elements of array:");
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0; i<size; i++){
                System.out.print("Enter element: ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Your array is: [ ");
            for(int i=0; i<size; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.print("]");
            System.out.println();

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int i=0; i<size; i++){
                if(arr[i]<min){
                    min= arr[i];
                }
            }

            for(int i=0; i<size; i++){
                if(arr[i]>max){
                    max= arr[i];
                }
            }
            
            System.out.println("The maximum value in the array is-> " + max + " & The minimum value in the array is-> " + min);
        }

        // Take an array of numbers as input and check if it is an array sorted in ascending order.
        else if(choice == 3){
            System.out.println("Enter no. of elements of array:");
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0; i<size; i++){
                System.out.print("Enter element: ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Your array is: [ ");
            for(int i=0; i<size; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.print("]");
            System.out.println();

            boolean isAscending = true;

            for(int i=0; i<size-1; i++){
                if(arr[i]>arr[i+1]){
                    isAscending = false;
                }
            }

            if(isAscending){
                System.out.println("The array is fully sorted.");
            }
            else{
                System.out.println("The array is unsorted.");
            }
        }

        else{
            System.out.println("Invalid choice");
        }

    }
}
