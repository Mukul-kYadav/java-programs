import java.util.*;

public class stringBuilder {
    public static void main(String[] args){
        System.out.println("Enter 1 to Take an array of String Buikders input from the user & Print length of all those string builders. \nEnter 2 Input a string from the user. Create a new string in which you will replace the letter e in the original string with letter i. \nEnter 3 to input your email id and extract your name from your email.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        if(choice == 1){
            // Take an array of String Builders input from the user & find the cumulative (combined) length of all those strings
            System.out.print("Enter number of string builders: ");
            int size = sc.nextInt();
            StringBuilder str = new StringBuilder("");
            for(int i=0; i<size; i++){
                str.append(sc.next());
            }
            System.out.println("Cumulative length is: " + str.length());
        }
    }
}
