package Map;
import java.util.*;
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> customerAccounts = new HashMap<>();
        TreeMap<Double, String> sortedAccounts = new TreeMap<>();
        Queue<String> withdrawalQueue = new LinkedList<>();
        System.out.println("Enter the number of customers:");
        int numCustomers = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numCustomers; i++) {
            System.out.print("Enter customer account number: ");
            String accountNumber = sc.nextLine();
            System.out.print("Enter balance for account " + accountNumber + ": ");
            double balance = sc.nextDouble();
            sc.nextLine();
            customerAccounts.put(accountNumber, balance);
        }
        updateSortedAccounts(customerAccounts, sortedAccounts);
        System.out.println("\nCustomer Accounts:");
        for (Map.Entry<String, Double> entry : customerAccounts.entrySet()) {
            System.out.println("Account: " + entry.getKey() + " | Balance: $" + entry.getValue());
        }
        System.out.println("\nEnter number of withdrawal requests:");
        int numRequests = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numRequests; i++) {
            System.out.print("Enter account number for withdrawal: ");
            String accountNumber = sc.nextLine();
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            if (customerAccounts.containsKey(accountNumber)) {
                withdrawalQueue.add(accountNumber + "," + amount);
            } else {
                System.out.println("Account not found.");
            }
        }
        processWithdrawals(withdrawalQueue, customerAccounts);
        System.out.println("\nUpdated Customer Accounts:");
        updateSortedAccounts(customerAccounts, sortedAccounts);
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            String account = entry.getValue();
            double balance = customerAccounts.get(account);
            System.out.println("Account: " + account + " | Balance: $" + balance);
        }
    }
    private static void updateSortedAccounts(HashMap<String, Double> customerAccounts, TreeMap<Double, String> sortedAccounts) {
        sortedAccounts.clear();
        for (Map.Entry<String, Double> entry : customerAccounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }
    }
    private static void processWithdrawals(Queue<String> withdrawalQueue, HashMap<String, Double> customerAccounts) {
        while (!withdrawalQueue.isEmpty()) {
            String request = withdrawalQueue.poll();
            String[] parts = request.split(",");
            String accountNumber = parts[0];
            double amount = Double.parseDouble(parts[1]);
            if (customerAccounts.containsKey(accountNumber)) {
                double currentBalance = customerAccounts.get(accountNumber);
                if (currentBalance >= amount) {
                    customerAccounts.put(accountNumber, currentBalance - amount);
                    System.out.println("Withdrawal of $" + amount + " successful from Account " + accountNumber);
                } else {
                    System.out.println("Insufficient balance in Account " + accountNumber);
                }
            }
        }
    }
}