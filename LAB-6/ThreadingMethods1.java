class ChildThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<3; i++){
            System.out.println("ChildThread");
        }Thread.yield();
    }
}public class ThreadingMethods1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ChildThread ct = new ChildThread();
        ct.start();
        ct.setName("ChildThread");
        System.out.println(ct.getName());
        Thread.currentThread().setName("MainThread");
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<3; i++){
            System.out.println("MainThread");
        }
        System.out.println(10/0);
    }
}
