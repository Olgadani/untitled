import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        Queue<String> queue3 = new ArrayDeque<>();
        Queue<String> queue4 = new ArrayDeque<>();
        Queue<String> queue5 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        randomFilling(queue3);
        randomFilling(queue4);
        randomFilling(queue5);
        System.out.println("Первая полка: " + queue1);
        System.out.println("Вторая полка: " + queue2);
        System.out.println("Третья полка: " + queue3);
        System.out.println("Четвертая полка: " + queue4);
        System.out.println("Пятая полка: " + queue5);
    }
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;
    public final static List<String> NAMES = List.of("Book1", "Book2", "Book3", "Book4", "Book5", "Book6");


    public static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }
}