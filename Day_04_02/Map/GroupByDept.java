package Map;
import java.util.*;
public class GroupByDept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> departmentMap = new HashMap<>();
        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee name:");
            String name = sc.nextLine();
            System.out.println("Enter department:");
            String department = sc.nextLine();
            departmentMap.putIfAbsent(department, new ArrayList<>());
            departmentMap.get(department).add(name);
        }
        for (Map.Entry<String, List<String>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}