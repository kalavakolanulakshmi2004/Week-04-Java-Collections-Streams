package List;
import java.util.*;
public class NthFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        System.out.println("Enter N (to find Nth element from end):");
        int k = sc.nextInt();
        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();
        for (int i = 0; i < k; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                System.out.println("N is greater than list size.");
                return;
            }
        }
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        if (slow.hasNext()) {
            System.out.println("Nth element from the end: " + slow.next());
        } else {
            System.out.println("Element not found.");
        }
    }
}