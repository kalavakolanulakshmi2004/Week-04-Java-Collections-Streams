package List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            arrayList.add(value);
            linkedList.add(value);
        }
        for (int i = 0; i < arrayList.size() / 2; i++) {
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(arrayList.size() - 1 - i));
            arrayList.set(arrayList.size() - 1 - i, temp);
        }
        for (int i = 0; i < linkedList.size() / 2; i++) {
            int temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(linkedList.size() - 1 - i));
            linkedList.set(linkedList.size() - 1 - i, temp);
        }
        System.out.println("Reversed ArrayList: " + arrayList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}