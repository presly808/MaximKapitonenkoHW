package week1HW; /**
 * Created by m_underwood on 3/13/16.
 */
import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter the second number:");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) { // в условии задания нет указаний по поводу случая если числа равны
            System.out.print("The first number is greater than the second by " + (firstNumber - secondNumber));
        } else {
            System.out.print("The sum of two numbers is: " + (firstNumber + secondNumber));
        }
    }
}