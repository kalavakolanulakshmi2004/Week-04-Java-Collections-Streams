package Set;
import java.util.*;
public class SymmetricDifference {
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
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        Set<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);
        result.removeAll(common);
        System.out.println("Symmetric Difference: " + result);
    }
}