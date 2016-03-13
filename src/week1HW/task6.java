package week1HW; /**
 * Created by m_underwood on 3/13/16.
 */
import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lowerLimit = 11;
        int higherLimit = 19;

        System.out.println("The program will output the sum of two numbers if it is within 11 to 19 limit");
        System.out.println("Please enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter the second number:");
        int secondNumber = sc.nextInt();

        if (firstNumber + secondNumber >= lowerLimit && firstNumber + secondNumber <= higherLimit) {
            System.out.println(firstNumber + secondNumber);
        } else {
            System.out.println("The sum is out of the proposed limit");
        }
    }
}