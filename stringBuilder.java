import java.util.*;

public class stringBuilder {
    public static void main(String[] args){
        System.out.println("Enter 1 to Take an array of String inputs from the user & Print length of all those string builders. \nEnter 2 Input a string from the user. Create a new string in which you will replace the letter e in the original string with letter i. \nEnter 3 to input your email id and extract your name from your email.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        if(choice == 1){
            // Take an array of String Builders input from the user & find the cumulative (combined) length of all those strings
            System.out.print("Enter number of strings: ");
            int size = sc.nextInt();
            StringBuilder str = new StringBuilder("");
            for(int i=0; i<size; i++){
                str.append(sc.next());
            }
            System.out.println("Cumulative length is: " + str.length());
        }

        else if(choice == 2){
            // Input a string from the user. Create a new string in which you will
            // replace the letter ‘e’ in the original string with letter ‘i’.
            // Example :
            // original = “eabcdef’ ; result = “iabcdif”
            // Original = “xyz” ; result = “xyz”
            System.out.print("Enter the string: ");
            StringBuilder str = new StringBuilder("");
            str.append(sc.next());
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='e'){
                    str.setCharAt(i, 'i');
                }
            }
            System.out.println("The new string is=> " + str);
        }

        else if(choice == 3){
            // Input an email from the user. You have to create a username from the email by
            // deleting the part that comes after ‘@’.
            System.out.print("Enter your Email name: ");
            StringBuilder str = new StringBuilder();
            str.append(sc.next());
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='@'){
                    str.delete(i, str.length());
                }
            }
            System.out.println("Your user name is=> " + str);
        }
    }
}
