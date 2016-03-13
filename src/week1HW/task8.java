package week1HW; /**
 * Created by m_underwood on 3/13/16.
 */
import java.util.Scanner;

public class task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("The programm will check if two numbers you enter have the same last digit.");
        System.out.println("Please enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter the second number:");
        int secondNumber = sc.nextInt();

        if (Math.abs(firstNumber % 10) == Math.abs(secondNumber % 10)) { //добавил Math.abs чтобы проверять отрицательные числа
            System.out.println("True, two numbers you have entered have the same last digit.");
        } else {
            System.out.println("False, two numbers you have entered have different last digits.");
        }
    }
}
