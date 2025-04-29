package Queues;
import java.util.*;
public class ReverseQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter the number of elements in the queue:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the queue:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }
        int front = queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }
}