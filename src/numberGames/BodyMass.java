package numberGames;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BodyMass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height: ");
        float height = scanner.nextFloat();

        System.out.println("Enter your weight: ");
        float weight = scanner.nextFloat();

        getBMI(height, weight);

        getBMIStatus(height, weight);

    }



    static void getBMI(float height, float weight) {

        float result = weight / (height * height);
        DecimalFormat formatDecimal = new DecimalFormat("0.00");
        System.out.println("Your BMI index is: " + formatDecimal.format(result));
    }

    static void getBMIStatus(float height, float weight) {
        float result = weight / (height * height);

        if (result < 18.5) {
            System.out.println("You are Underweight");
        } else if (result >= 18.5 && result <= 24.9) {
            System.out.println("You weight is normal");
        } else if (result >= 25 && result <= 29.9) {
            System.out.println("You are Overweight");
        } else {
            System.out.println("You are Obese");
        }
    }


}
