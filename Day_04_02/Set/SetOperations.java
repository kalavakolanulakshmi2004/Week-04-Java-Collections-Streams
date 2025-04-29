package Set;
import java.util.*;
public class SetOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        System.out.println("Enter no.of elements for n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter "+ n1 + " elements: ");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }
        System.out.println("Enter no.of elements for n2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter "+ n2 + " elements: ");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}