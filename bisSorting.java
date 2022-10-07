import java.util.Scanner;

public class bisSorting {
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter 1 for Bubble sort. \nEnter 2 for Insertion sort. \nEnter 3 for Selection sort.");
        int choice = sc.nextInt();
        if(choice == 1){
            bubblesort(array);
        } else if(choice == 2){
            insertionsort(array);
        } else if(choice == 3){
            selectionsort(array);
        } else{
            System.out.println("Invalid choice");
        }
    }

    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Bubble sorted array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>curr) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        System.out.print("Insertion sorted arra is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i]= temp;
        }
        System.out.print("Selection sorted array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
