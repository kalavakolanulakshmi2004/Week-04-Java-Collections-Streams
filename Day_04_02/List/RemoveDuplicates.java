package List;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        List<Integer> inputList = new ArrayList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            inputList.add(sc.nextInt());
        }
        List<Integer> resultList = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : inputList) {
            if (!seen.contains(num)) {
                seen.add(num);
                resultList.add(num);
            }
        }
        System.out.println("List after removing duplicates: " + resultList);
    }
}