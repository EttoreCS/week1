package week1.IfStatements;

import java.util.Scanner;

public class ALittleQuiz {
    public ALittleQuiz() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        int var2 = 0;
        System.out.print("Are, you ready for a quiz? ");
        String var3 = var1.next();
        if (var3.equals("Yes")) {
            System.out.println("Okay, here it comes! ");
            System.out.println();
            System.out.println("Q1) What is the capital of Alaska?");
            System.out.println("\t\t 1) Melbourne");
            System.out.println("\t\t 2) Anchorage");
            System.out.println("\t\t 3) Juneau");
            System.out.println();
            int var4 = var1.nextInt();
            if (var4 == 3) {
                System.out.println();
                System.out.println("That's right!");
                ++var2;
            } else {
                System.out.println();
                System.out.println("Sorry, Juneau is the capital of Alaska.");
            }

            System.out.println();
            System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
            System.out.println("\t\t 1) Yes");
            System.out.println("\t\t 2) No");
            System.out.println();
            int var5 = var1.nextInt();
            if (var5 == 1) {
                System.out.println();
                System.out.println("Sorry, \"cat\" is a String , ints can only be numbers.");
            } else {
                System.out.println();
                System.out.println("That's right!");
                ++var2;
            }

            System.out.println();
            System.out.println("Q3) What is the result of 9+6/3? ");
            System.out.println("\t\t 1) 5");
            System.out.println("\t\t 2) 11");
            System.out.println("\t\t 3) 15/3");
            System.out.println();
            int var6 = var1.nextInt();
            if (var6 == 2) {
                System.out.println();
                System.out.println("That's right!");
                ++var2;
            } else {
                System.out.println();
                System.out.println("Sorry, 11 is the correct answer.");
            }

            System.out.println();
            if (var2 == 3) {
                System.out.println("Overall you got all 3 correct.");
            } else {
                System.out.println("Overall you got " + var2 + " out of 3 correct.");
            }
        }

        System.out.println("Thanks for playing!");
    }
}
