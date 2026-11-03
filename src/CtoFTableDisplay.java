public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%-15s | %-15s\n", "Celsius", "Fahrenheit");
        System.out.println("---------------------------------");

        for (int c = -100; c <= 100; c++) {
            double f = CtoF(c);
            System.out.printf("%-15d | %-15.2f\n", c, f);
        }
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9.0 / 5.0) + 32.0;
    }
}