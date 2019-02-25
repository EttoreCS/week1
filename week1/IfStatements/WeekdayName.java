package week1.IfStatements;

import java.util.GregorianCalendar;

public class WeekdayName {
    public WeekdayName() {
    }

    public static String weekday_name(int var0) {
        String var1 = "";
        if (var0 == 1) {
            var1 = "Sunday";
        } else if (var0 == 2) {
            var1 = "Monday";
        } else if (var0 == 3) {
            var1 = "Tuesday";
        } else if (var0 == 4) {
            var1 = "Wednesday";
        } else if (var0 == 5) {
            var1 = "Thursday";
        } else if (var0 == 6) {
            var1 = "Friday";
        } else if (var0 == 7) {
            var1 = "Saturday";
        } else if (var0 == 0) {
            var1 = "Saturday";
        } else {
            var1 = "error";
        }

        return var1;
    }

    public static void main(String[] var0) {
        System.out.println("Weekday 1: " + weekday_name(1));
        System.out.println("Weekday 2: " + weekday_name(2));
        System.out.println("Weekday 3: " + weekday_name(3));
        System.out.println("Weekday 4: " + weekday_name(4));
        System.out.println("Weekday 5: " + weekday_name(5));
        System.out.println("Weekday 6: " + weekday_name(6));
        System.out.println("Weekday 7: " + weekday_name(7));
        System.out.println("Weekday 0: " + weekday_name(0));
        System.out.println();
        System.out.println("Weekday 43: " + weekday_name(43));
        System.out.println("Weekday 17: " + weekday_name(17));
        System.out.println("Weekday -1: " + weekday_name(-1));
        GregorianCalendar var1 = new GregorianCalendar();
        int var2 = var1.get(7);
        System.out.println("\nToday is a " + weekday_name(var2) + "!");
    }
}
