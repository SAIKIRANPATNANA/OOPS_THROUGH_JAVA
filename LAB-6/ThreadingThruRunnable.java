class ChildThread implements Runnable{
    public void run() {
        for(int i=0; i<3; i++){
            System.out.println("Child Thread");
        }
    }
}public class ThreadingThruRunnable {
    public static void main(String[] args) {
        ChildThread ct = new ChildThread();
        Thread t = new Thread(ct);
        t.start();
        for(int i=0; i<3; i++){
            System.out.println("Main Thread");
        }
    }
}
