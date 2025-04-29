package List;
import java.util.*;
public class ListRotator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements: ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter number of positions to rotate: ");
        int k = sc.nextInt();
        k = k % n;
        List<Integer> rotated = new ArrayList<>();
        for (int i = k; i < n; i++) {
            rotated.add(list.get(i));
        }
        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }
        System.out.println("Rotated List: " + rotated);
    }
}