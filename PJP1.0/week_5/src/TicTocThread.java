import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicTocThread {
    static class Tic implements Runnable{

        @Override
        public void run() {
            System.out.println("Tic");
        }
    }

    static class Toc implements Runnable{

        @Override
        public void run() {
            System.out.println("Toc");
        }
    }

    public static void main(String[] args) {
        ExecutorService e = Executors.newSingleThreadExecutor();
        for(int i = 0;i<10;i++){
            e.execute(new Tic());
            e.execute(new Toc());
        }
        e.shutdown();
    }
}
