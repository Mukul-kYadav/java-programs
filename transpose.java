import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        // code to print transpose of a matrix
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of rows of matrix: ");
            int n = sc.nextInt();
            System.out.print("Enter number of columns of matrix: ");
            int m = sc.nextInt();
    
            // creating matrix
            int[][] matrix = new int[n][m];
    
            // input elements
            System.out.println("Enter Elements of matrix: ");
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    matrix[i][j]= sc.nextInt();
                }
            }

            // showing matrix
            System.out.println("Entered Matrix is:");
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            // to print transpose
            System.out.println("Transpose of the matrix is:");
            for(int j=0; j<m; j++){
                for(int i=0; i<n; i++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

    }
}
