import java.util.Scanner;

public class ComputeAndInterpretBMI {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your weight in pounds: ");
    double weight = input.nextDouble();

    System.out.print("Enter your height in Inches: ");
    double height = input.nextDouble();

    final double KILOGRAMS_PER_POUND = 0.45359237;     // Constant
    final double METERS_PER_INCH = 0.0254;             // Constant

    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;
    double bmi = weightInKilograms / (heightInMeters * heightInMeters);

    System.out.println("BMI is " + bmi );
    if (bmi < 18.5){
      System.out.println("Underwight bro..eat more :)");
    }
    else if (bmi < 25){
      System.out.println("Normal Apparently");
    }  
    else if (bmi < 30){
      System.out.println("Overweight...did you ever plan to lose weight?");
    }  
    else {
      System.out.println("DAMMMNNN NIGGA YOU EITHER LOOSE THE WEIGHT OR MUST BE HELLA SHREDDED");
    }
  }
}