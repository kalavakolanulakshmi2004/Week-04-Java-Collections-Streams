package Map;
import java.time.LocalDate;
import java.util.*;
public class InsurancePolicyMgmtSystem {
    static class InsurancePolicy {
        private String policyNumber;
        private String policyHolder;
        private LocalDate expiryDate;
        public InsurancePolicy(String policyNumber, String policyHolder, LocalDate expiryDate) {
            this.policyNumber = policyNumber;
            this.policyHolder = policyHolder;
            this.expiryDate = expiryDate;
        }
        public String getPolicyNumber() {
            return policyNumber;
        }
        public String getPolicyHolder() {
            return policyHolder;
        }
        public LocalDate getExpiryDate() {
            return expiryDate;
        }
        public String toString() {
            return "PolicyNumber: " + policyNumber + ", Holder: " + policyHolder + ", Expiry: " + expiryDate;
        }
    }
    public static void main(String[] args) {
        Map<String, InsurancePolicy> hashMap = new HashMap<>();
        Map<String, InsurancePolicy> linkedHashMap = new LinkedHashMap<>();
        TreeMap<LocalDate, List<InsurancePolicy>> treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of policies to add:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Policy Number:");
            String number = sc.nextLine();
            System.out.println("Enter Policy Holder Name:");
            String holder = sc.nextLine();
            System.out.println("Enter Expiry Date (yyyy-mm-dd):");
            LocalDate expiry = LocalDate.parse(sc.nextLine());
            InsurancePolicy policy = new InsurancePolicy(number, holder, expiry);
            hashMap.put(number, policy);
            linkedHashMap.put(number, policy);
            treeMap.putIfAbsent(expiry, new ArrayList<>());
            treeMap.get(expiry).add(policy);
        }
        System.out.println("\nEnter policy number to retrieve:");
        String number = sc.nextLine();
        InsurancePolicy found = hashMap.get(number);
        if (found != null)
            System.out.println("Found: " + found);
        else
            System.out.println("Policy not found.");
        LocalDate today = LocalDate.now();
        LocalDate next30 = today.plusDays(30);
        System.out.println("\nPolicies expiring in next 30 days:");
        for (Map.Entry<LocalDate, List<InsurancePolicy>> entry : treeMap.subMap(today, true, next30, true).entrySet()) {
            for (InsurancePolicy p : entry.getValue()) {
                System.out.println(p);
            }
        }
        System.out.println("\nEnter policyholder name to search:");
        String name = sc.nextLine();
        System.out.println("Policies held by: " + name);
        for (InsurancePolicy p : hashMap.values()) {
            if (p.getPolicyHolder().equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
        Iterator<Map.Entry<String, InsurancePolicy>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, InsurancePolicy> entry = iterator.next();
            if (entry.getValue().getExpiryDate().isBefore(today)) {
                iterator.remove();
                linkedHashMap.remove(entry.getKey());
                treeMap.get(entry.getValue().getExpiryDate()).remove(entry.getValue());
            }
        }
        System.out.println("\nExpired policies removed.");
    }
}