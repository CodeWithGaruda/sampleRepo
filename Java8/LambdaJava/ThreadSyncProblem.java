package Java8.LambdaJava;

class Counter {
    public synchronized void incr() {
        ThreadSyncProblem.a++;
    }
}

class ThreadSyncProblem {
    static int a;

    public static void main(String[] args) {
        Counter c = new Counter();
        Thread krishna = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    try {
                        c.incr();
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "krishna");
        Thread sanath = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    c.incr();
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "sanath");
        krishna.start();
        sanath.start();
        try {
            krishna.join();
            sanath.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }
}