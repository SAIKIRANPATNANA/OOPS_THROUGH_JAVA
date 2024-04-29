class ChildThread implements Runnable {
    public void run() {
        System.out.println("Hayyoda..!"+Thread.currentThread().getName());
    }
}public class MultipleThreadingThruRunnable {
        public static void main(String[] args) {
            ChildThread ct = new ChildThread();
            Thread t1 = new Thread(ct);
            Thread t2 = new Thread(ct);
            Thread t3 = new Thread(ct);
            t1.start();
            t2.start();
            t3.start();
            System.out.println("Hayyoda..! "+Thread.currentThread().getName());
        }
}
