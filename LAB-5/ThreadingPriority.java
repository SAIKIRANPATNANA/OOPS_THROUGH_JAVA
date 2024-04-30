class ChildThread extends Thread {
    public void run(){
        System.out.println("ChildThread");
    }
}public class ThreadingPriority {
    public static void main(String[] args){
        ChildThread ct = new ChildThread();
        System.out.println(ct.getPriority());
        System.out.println(Thread.currentThread().getPriority());
        ct.setPriority(10);
        Thread.currentThread().setPriority(1);
        System.out.println(ct.getPriority());
        System.out.println(Thread.currentThread().getPriority());
        ct.start();
        System.out.println("MainThread");
    }
}
