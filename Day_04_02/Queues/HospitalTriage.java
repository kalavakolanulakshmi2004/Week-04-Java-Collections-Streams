package Queues;
import java.util.*;
class Patient implements Comparable<Patient> {
    String name;
    int severity;
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity);
    }
}
public class HospitalTriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        System.out.println("Enter no.of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter "+ n + " elements: ");
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int severity = sc.nextInt();
            queue.add(new Patient(name, severity));
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll().name);
        }
    }
}