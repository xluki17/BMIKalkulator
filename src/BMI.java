/**
 * prosty kalkulator BMI
 */

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OBLICZANIE WSKŻNIKA BMI!");
        System.out.println("Podaj swój wzrost w cm: ");
        double height = scanner.nextDouble();
        height = height / 100;
        System.out.println("Podaj swoją wagęw kg: ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Twój wskażnik BMI wynosi:  " + bmi);

        if (bmi < 18.5) {
            System.out.println("Masz niedowagę");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normalna waga");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Nadwaga");
        } else if (bmi >= 30) {
            System.out.println("Otyły");
        }
    }
}
