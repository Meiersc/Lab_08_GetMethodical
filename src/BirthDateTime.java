import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12);

        int maxDays = 31;
        switch (month) {
            case 2:
                maxDays = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter birth day", 1, maxDays);
        int hours = SafeInput.getRangedInt(in, "Enter birth hour", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter birth minute", 1, 59);

        System.out.println("\nBirth Date & Time: " + month + "/" + day + "/" + year + " at " + hours + ":" + (minutes < 10 ? "0" + minutes : minutes));
    }
}
