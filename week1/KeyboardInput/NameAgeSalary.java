package week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public NameAgeSalary() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Hello, What is your name?");
        String var2 = var1.next();
        System.out.println("Hi, " + var2 + "! How old are you?");
        int var3 = var1.nextInt();
        System.out.println("So you're " + var3 + ", eh?  That's not old at all!");
        System.out.println("How much do you make, " + var2 + "?");
        double var4 = var1.nextDouble();
        System.out.println(var4 + "!  I hope that's per hour and not per year! LOL!");
    }
}
