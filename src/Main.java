import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main (String[] args) {
        System.out.println("----------------------Clocks---------------------");
        List<Clock> clocks = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            clocks.add(new Clock());
        }

        for (Clock clock : clocks) {
            System.out.println(clock);
            clock.addSeconds(60);
            System.out.println(clock + "\n");
        }

        System.out.println("---------------------Divisors--------------------");
        int i = 0;
        while (4 * i <= 100) {
            System.out.println(4 * i++);
        }
    }
}
