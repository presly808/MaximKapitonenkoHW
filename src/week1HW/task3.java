package week1HW; /**
 * Created by m_underwood on 3/13/16.
 */
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testNumber = 7;

        System.out.println("Please enter a whole number:");
        int userNumber = sc.nextInt();

        if (userNumber % testNumber == 0) {
            System.out.println(userNumber * 2);
        } else {
            System.out.println("Your number is not divisible by " + testNumber);
        }
    }
}
