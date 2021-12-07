package firstassignment;//Write a Java program that reads a line of integers and then displays each integer and
// the sum of all integers.

import java.util.Scanner;
import java.util.StringTokenizer;
public class Integers{
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with firstassignment.one space gap: ");
        String t = sc.nextLine();
        StringTokenizer st = new StringTokenizer(t, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            int s = Integer.parseInt(temp);
            System.out.println(s);
            sum = sum + s;
        }
        System.out.println("Sum of the integers is: " + sum);

    }


}