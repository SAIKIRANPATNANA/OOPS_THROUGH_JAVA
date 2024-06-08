class ChildThread extends Thread {
    public void run() {
        System.out.println("Hayyoda..!"+Thread.currentThread().getName());
    }
}public class MultipleThreadingThruExtending{
    public static void main(String[] args) {
        ChildThread ct1 = new ChildThread();
        ChildThread ct2 = new ChildThread();
        ChildThread ct3 = new ChildThread();
        ct1.start();
        ct2.start();
        ct3.start();
        System.out.println("Hayyoda..!"+Thread.currentThread().getName());
    }}
