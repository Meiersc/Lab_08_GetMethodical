import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter your UC M-Number (e.g. M12345)", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Enter menu choice [OoSsVvQq]", "^[OoSsVvQq]$");

        System.out.println("\nValid inputs received:");
        System.out.println("SSN: " + ssn);
        System.out.println("M-Number: " + mNumber);
        System.out.println("Menu Choice: " + menuChoice);
    }
}
