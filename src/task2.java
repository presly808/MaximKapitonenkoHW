/**
 * Created by m_underwood on 3/11/16.
 */
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        int firstNumber = sc.nextInt();

        System.out.println("Please enter the second number:");
        int secondNumber = sc.nextInt();

        System.out.println("Please enter the third number:");
        int thirdNumber = sc.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The biggest number is " + firstNumber);
            if (secondNumber < thirdNumber) {
                System.out.println("The smallest number is" + secondNumber);
            } else {
                System.out.println("The smallest number is" + thirdNumber);
            }
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The biggest number is " + secondNumber);
            if (firstNumber < thirdNumber) {
                System.out.println("The smallest number is " + firstNumber);
            } else {
                System.out.println("The smallest number is " + thirdNumber);
            }
        } else {
            System.out.println("The biggest number is " + thirdNumber);
            if (firstNumber < secondNumber) {
                System.out.println("The smallest number is " + firstNumber);
            } else {
                System.out.println("The smallest number is " + secondNumber);
            }
        }

    }
}
