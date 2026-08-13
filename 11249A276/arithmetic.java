import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        String input = sc.nextLine();

        try {
            int age = Integer.parseInt(input);
            System.out.println("Age: " + age);

            int x = 10 / 0;
        }
        catch (NumberFormatException e) {
            System.out.println("Enter a valid number");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
