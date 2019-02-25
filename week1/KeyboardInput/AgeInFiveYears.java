package week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public AgeInFiveYears() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Hello.  What is your name? ");
        String var2 = var1.next();
        System.out.println();
        System.out.print("Hi, " + var2 + "! How old are you? ");
        int var3 = var1.nextInt();
        System.out.println();
        int var4 = var3 + 5;
        int var5 = var3 - 5;
        System.out.println("Did you know that in five years you will be " + var4 + " years old!");
        System.out.println("And  five years ago you were " + var5 + "! Imagine that!");
    }
}
