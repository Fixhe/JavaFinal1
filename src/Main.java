import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number (enter '0' to stop):");

        int number;
        String input = "";

        do {
            System.out.print("Enter Number: ");
            number = scanner.nextInt();

            if(number != 0) {
                input += number + " ";
            }
        } while (number != 0);

        System.out.println("Input numbers: " + input);
    }
}
