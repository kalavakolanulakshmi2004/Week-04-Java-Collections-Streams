package List;
import java.util.*;
public class FreqCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> items = new ArrayList<>();
        System.out.print("Enter no.of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter "+ n+" elements: ");
        for (int i = 0; i < n; i++) {
            items.add(sc.next());
        }
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        System.out.println("Frequencies of each elements is: ");
        System.out.println(frequencyMap);
    }
}