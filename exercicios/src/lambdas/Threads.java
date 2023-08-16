package lambdas;

public class Threads {

    public static void main(String[] args) {

        Runnable trabalho1 = new Trabalho1();
        Runnable trabalho2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Tarefa #2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                }

            }
        };

        Runnable trabalho3 = Threads::trabalho3;

        Thread t1 = new Thread(trabalho1);
        Thread t2 = new Thread(trabalho2);
        Thread t3 = new Thread(trabalho3);

        t1.start();
        t2.start();
        t3.start();
    }

    static void trabalho3() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tarefa #3");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}
