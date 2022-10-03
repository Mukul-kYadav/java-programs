import java.util.Scanner;

/**
 * first
 */
public class calculator {

    public static void main(String[] args) {

        int i = 0;
        while (i < 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println(
                    "Choose operation (\n press 0 to exit, \n 1 for 'addition',\n 2 for 'subtraction',\n 3 for 'multiplication',\n 4 for 'remainder',\n 5 for 'division':)");
            int s = sc.nextInt();
            if (s != 0) {
                System.out.println("Enter first number: ");
                int a = sc.nextInt();
                System.out.println("Enter second number:");
                int b = sc.nextInt();

                if (s == 1) {
                    int sum = a + b;
                    System.out.println("The sum is: "
                            + sum);
                } else if (s == 2) {
                    int diff = a - b;
                    System.out.println("The difference is: " + diff);
                } else if (s == 3) {
                    int diff = a * b;
                    System.out.println("The product is: " + diff);
                } else if (s == 4) {
                    if (b == 0) {
                        System.out.println("invalid division");
                    } else {
                        int diff = a / b;
                        System.out.println("The quotient is: " + diff);
                    }
                } else if (s == 5) {
                    if (b == 0) {
                        System.out.println("invalid division");
                    } else {
                        int diff = a % b;
                        System.out.println("The remainder is: " + diff);
                    }
                } else {
                    System.out.println("Sorry operation cant be done");
                }
            } else {
                i = 2;
                System.out.println("program stopped successfully!");
            }
        }
    }
}