import java.lang.Math;
import java.util.*;



public class bitManipulation {
    public static void main(String[] args) {
        System.out.println("Enter 1 to check whether a number is power of 2 or not \nEnter 2 to toggle a bit at position in a number \nEnter 3 to count the number of 1’s in a binary representation of the number \nEnter 4 to convert a number from one number system to another");
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

        else if(choice==2){
            // Write a program to toggle a bit at position = “pos” in a number “n”.
            // steps to solve the problem first we will get the number at position - pos > then if the pos is 1 the we will use clear and if the number is 0 then we will set to 1.
            System.out.print("Enter the number to be toggled: ");
            int num = sc.nextInt();
            System.out.print("Enter the position: ");
            int pos = sc.nextInt();
            int bitMask = 1<<pos;
            if((bitMask & num)==0){
                // bit is zero then set to 1
                int newNumber = bitMask | num;
                System.out.println("The new Number is: "+ newNumber);
            }
            else{
                int newBitMask = ~(bitMask);
                int newNumber = newBitMask & num;
                System.out.println("The new number is " + newNumber);
            }
        }

        else if(choice==3){
            // Write a program to count the number of 1’s in a binary representation of the number.
            // steps to solve : set count to 0 the use get operaition if 1 then count++
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            int count=0;
            int bitmask=1;
            for(int i=1; i<=9; i++){
                if((bitmask & num)!=0){
                    // bit is 1
                    count++;
                    bitmask = 1<<i;
                }
                else{ 
                    bitmask=1<<i;
                }
            }
            System.out.println("Number of 1's are: " + count);

        }

        else if(choice==4){
            // Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]
            // function to convert binary to decimal
            System.out.println("Enter 1 to convert decimal to binary. \nEnter 2 to convert binary to decimal. ");
            int conversionChoice =  sc.nextInt();
            if(conversionChoice==2){
                System.out.print("Enter binary number: ");
                String binNum = sc.next();
                binaryToDecimal(binNum);
            }
            else if(conversionChoice==1){
                System.out.print("Enter decimal number: ");
                int num = sc.nextInt();
                decimalToBinary(num);
            }
            else{
                System.out.println("Invalid choice");
            }
        }

        
        else{
            System.out.println("Invalid input.");
        }
    }

    public static void binaryToDecimal(String num) {
        double deci = 0;
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i)=='1'){
                deci+=  Math.pow(2, (num.length()-1-i));
            }
        }
        System.out.println("Decimal representation of " + num + " is " + deci);
    }

    public static void decimalToBinary(int num) {
        int binNum[]=new int[num];
         int i =0;
         while(num>0){
            binNum[i] = num%2;
            num = num/2;
            i++;
         }
         System.out.print("Binary representation of " + num + " is ");

         for (int j = i-1; j>=0; j--) {
            System.out.print(binNum[j]);
         }
    }
}
