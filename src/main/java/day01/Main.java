package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Kérem a következő számot: ");
            number = scanner.nextInt();
        } while (positiveNumberContainer.addPositiveNumber(number));

        positiveNumberContainer.printPositiveNumbers();
    }
}
