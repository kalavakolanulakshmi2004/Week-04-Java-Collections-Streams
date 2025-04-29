package Map;
import java.util.*;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> productPrices = new HashMap<>();
        LinkedHashMap<String, Integer> cartItems = new LinkedHashMap<>();
        System.out.println("Enter number of products:");
        int numProducts = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter product name: ");
            String product = sc.nextLine();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            productPrices.put(product, price);
        }
        System.out.println("Enter number of items in the cart:");
        int numItems = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter product name for cart: ");
            String product = sc.nextLine();
            System.out.print("Enter quantity for " + product + ": ");
            int quantity = sc.nextInt();
            sc.nextLine();
            cartItems.put(product, quantity);
        }
        double totalCost = 0;
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPrices.get(product);
            double cost = price * quantity;
            totalCost += cost;
        }
        TreeMap<Double, String> sortedByPrice = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPrices.get(product);
            sortedByPrice.put(price, product);
        }
        for (Map.Entry<Double, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + ": $" + entry.getKey());
        }
        System.out.println("Total cost: $" + totalCost);
    }
}