package week1.KeyboardInput;

import java.util.Scanner;

public class MoreUserInputOfData {
    public MoreUserInputOfData() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Please enter the following information so I can sell it for a profit!");
        System.out.println("");
        System.out.print("First name: ");
        String var2 = var1.next();
        System.out.print("Last name: ");
        String var3 = var1.next();
        System.out.print("Grade(9-12): ");
        int var4 = var1.nextInt();
        System.out.print("Student ID: ");
        int var5 = var1.nextInt();
        System.out.print("Login: ");
        String var6 = var1.next();
        System.out.print("GPA (0.0-4.0): ");
        double var7 = var1.nextDouble();
        System.out.println("");
        System.out.println("Your information:");
        System.out.println("\t\tLogin: " + var6);
        System.out.println("\t\tID:    " + var5);
        System.out.println("\t\tName:  " + var3 + ", " + var2);
        System.out.println("\t\tGPA:   " + var7);
        System.out.println("\t\tGrade: " + var4);
    }
}
