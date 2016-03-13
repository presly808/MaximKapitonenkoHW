package week1HW; /**
 * Created by m_underwood on 3/11/16.
 */
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter current time:");
        int time = sc.nextInt();
        if (time >= 9 && time <= 18){
            System.out.println("I am at work");
        } else {
            System.out.println("I am resting");
        }
    }
}
