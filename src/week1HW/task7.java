package week1HW; /**
 * Created by m_underwood on 3/13/16.
 */
import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter the second number:");
        int secondNumber = sc.nextInt();

        if (firstNumber % secondNumber == 0) {
            System.out.println("True, first number is divisible by second number. " +
                               "The whole part of the division is: " + firstNumber / secondNumber +
                                ". The remainder is: " + firstNumber % secondNumber);
        } else {
            if (secondNumber % firstNumber == 0) {
                System.out.println("True, second number is divisible by first number. " +
                        "The whole part of the division is: " + secondNumber / firstNumber +
                        ". The remainder is: " + secondNumber % firstNumber);
            } else {
                System.out.println("False, numbers are not divisible by each other. " +
                        "The whole part of dividing the first number by the second number is: " + firstNumber / secondNumber +
                        ". The remainder is: " + firstNumber % secondNumber);
            }
        }
    }
}
