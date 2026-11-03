import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems = true;

        do {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter price of item", 0.50, 10.00);
            totalCost += itemPrice;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
        } while (moreItems);

        System.out.printf("\nTotal cost of items: $%.2f\n", totalCost);
    }
}