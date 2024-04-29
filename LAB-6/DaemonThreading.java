class ChildThread extends Thread {
    public void run(){
        System.out.println("ChildThread");
    }
}public class DaemonThreading {
        public static void main(String[] args) throws Exception {
            ChildThread ct = new ChildThread();
            System.out.println(ct.isDaemon());
            System.out.println(Thread.currentThread().isDaemon());
            ct.setDaemon(true);
            // Thread.currentThread().setDaemon(true);
            System.out.println(ct.isDaemon());
            ct.start();
            System.out.println("MainThread");
        }
}
