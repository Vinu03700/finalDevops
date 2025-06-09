import java.util.Scanner;

public class Number{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("The number"+num+" is positive.");
        } 
         if (num < 0) {
            System.out.println("The number"+num+" is Negative.");
        } else{
            System.out.println("The number"+num+" is Zero.");
        }

        scanner.close(); 
    }
}
