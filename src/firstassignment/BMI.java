package firstassignment;//Write a Java program to compute body massindex (firstassignment.BMI).

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the height in meter");
        double height = sc.nextDouble();
        System.out.println("Enter the weight in kg");
        double weight = sc.nextDouble();

        double BMI = weight / (height*height) ;
        System.out.println("The firstassignment.BMI is " + BMI);
    }

}