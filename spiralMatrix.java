import java.io.File;
import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
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
    
            // initializing
            // rs=row start | re=row end | cs=column start | ce=column end
            int rs = 0; 
            int re = n-1;
            int cs = 0;
            int ce = m-1;
            
            //algorithm
            while(rs<=re && cs<=ce){
                for(int col=cs; col<=ce; col++){
                    System.out.print(matrix[rs][col] + " ");
                }
                rs++;
    
                for(int row=rs; row<=re; row++){
                    System.out.print(matrix[row][ce] + " ");
                }
                ce--;
    
                for(int col=ce; col>=cs; col--){
                    System.out.print(matrix[re][col] + " ");
                }
                re--;
    
                for(int row=re; row>=rs; row--){
                    System.out.print(matrix[row][cs] + " ");
                }
                cs++;
            }
    }
}
