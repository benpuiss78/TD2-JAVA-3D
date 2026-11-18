import java.util.ArrayList;

public class test_service {

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            threads.add(new Thread(new Service("Service " + i)));
        }

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (Exception e) {
                return;
            }
        }

        System.out.println("Tous les services ont terminé.");
    }
}