import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "0";
        do
        {
            System.out.print("\n" +prompt + ": ");
                retString = pipe.nextLine();
        }while(retString.length() == 0);
        return retString;
    }
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // Clear newline
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer. You entered: " + trash);
            }
        } while (!done);
        return retVal;
    }
    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0.0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // Clear newline
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double. You entered: " + trash);
            }
        } while (!done);
        return retVal;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // Clear newline
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("Number out of range [" + low + " - " + high + "]. You entered: " + retVal);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer. You entered: " + trash);
            }
        } while (!done);
        return retVal;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0.0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // Clear newline
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("Number out of range [" + low + " - " + high + "]. You entered: " + retVal);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double. You entered: " + trash);
            }
        } while (!done);
        return retVal;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response = "";
        boolean retVal = false;
        boolean done = false;
        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                retVal = true;
                done = true;
            } else if (response.equalsIgnoreCase("N")) {
                retVal = false;
                done = true;
            } else {
                System.out.println("You must enter [Y/N]. You entered: " + response);
            }
        } while (!done);
        return retVal;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String response = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regEx)) {
                done = true;
            } else {
                System.out.println("Invalid input. Must match pattern: " + regEx);
            }
        } while (!done);
        return response;
    }
    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        int availableWidth = 54; // 60 total minus 3 stars on each side (6)
        int totalPadding = availableWidth - msg.length();
        int leftPadding = totalPadding / 2;
        int rightPadding = totalPadding - leftPadding;

        System.out.print("***");
        for (int i = 0; i < leftPadding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightPadding; i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

