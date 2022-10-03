import java.util.*;

public class strings {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to Take an array of Strings input from the user & Print length of all those strings. \nEnter 2 Input a string from the user. Create a new string in which you will replace the letter e in the original string with letter i. \nEnter 3 to input your email id and extract your name from your email.");
        int choice = sc.nextInt();

        if(choice == 1){

            // Take an array of Strings input from the user & find the cumulative (combined)
            // length of all those strings.
            System.out.println("Enter string size: ");
            int size = sc.nextInt();
            String array[] = new String[size];
            int len = 0;
            System.out.println("Enter array of strings:");
            for(int i=0; i<size; i++){
                array[i] = sc.next();
                len += array[i].length();
            }
            System.out.println("Cumulative length of all those strings is: " + len);
        }

        else if(choice == 2){
            // Input a string from the user. Create a new string in which you will
            // replace the letter ‘e’ in the original string with letter ‘i’.
            // Example :
            // original = “eabcdef’ ; result = “iabcdif”
            // Original = “xyz” ; result = “xyz”
            String show = "";
            System.out.print("Enter the string: ");            
            String str = sc.next();
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='e'){
                    show+="i";
                }
                else{
                    show+=str.charAt(i);
                }
            }
            System.out.println("The new string is: " + show);
        }

        else if(choice == 3){
            // Input an email from the user. You have to create a username from the email by
            // deleting the part that comes after ‘@’.
            System.out.print("Enter your Email: ");
            String mail = sc.next();
            String name = "";
            for(int i=0; i<mail.length(); i++){
                if(mail.charAt(i) != '@'){
                    name+= mail.charAt(i);
                }
                else{
                    System.out.println("Name is: " + name);
                }
            }
        }

        else{
            System.out.println("Error! Invalid input");
        }
    }

}
