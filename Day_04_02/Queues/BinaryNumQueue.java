package Queues;
import java.util.*;
public class BinaryNumQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements: ");
        int N = sc.nextInt();
        generateBinaryNumbers(N);
    }
    public static void generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            System.out.print(current + " ");
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}