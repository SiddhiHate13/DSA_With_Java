import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class QueueImp {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<String> q = new ArrayDeque<>();
        System.out.println("How many Students");
        int noOfStudent = s.nextInt();
        for(int i = 0; i < noOfStudent; i++)
        {
            String name = s.next();
            q.add(name);
        }
        System.out.println("How many Seats");
        int noOfSeats = s.nextInt();
        for(int i = 0; i < noOfSeats; i++){
            String name = q.remove();
            System.out.println(name + " got the seat");
        }
    }
}