package week1HW;

/**
 * Created by m_underwood on 3/13/16.
 */

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number and the program will check if it lies within 0 to 1 limit:");
        double userInput = sc.nextDouble();

        if (userInput < 1 && userInput > 0) {
            System.out.println("The number is within 0 to 1 limit");
        } else {
            System.out.println("The number is NOT within 0 to 1 limit");
        }
    }
}
