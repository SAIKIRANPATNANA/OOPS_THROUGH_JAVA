class ChildThread implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
    }
}public class ThreadGrouping{
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("ThreadGroup1");
        ThreadGroup tg2 = new ThreadGroup("ThreadGroup2");
        ChildThread ct = new ChildThread();
        Thread t1 = new Thread(tg1,ct,"Thread1");
        Thread t2 = new Thread(tg1,ct,"Thread2");
        Thread t3 = new Thread(tg1,ct,"Thread3");
        Thread t4 = new Thread(tg2,ct,"Thread4");
        Thread t5 = new Thread(tg2,ct,"Thread5");
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getThreadGroup().getName() + " " + Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println(tg1.getParent().getName());
        System.out.println(t1.getName() + " " + t1.getThreadGroup().getName());
        System.out.println(t4.getName() + " " + t4.getThreadGroup().getName());
        t1.start();
        t2.start();
        t4.start();
        t3.start();
        t5.start();
        System.out.println(tg1.activeCount());
        System.out.println(tg2.activeCount());
        Thread ts[] = new Thread[tg1.activeCount()];
        tg1.enumerate(ts);
        for(int i=0; i<ts.length; i++){
            if(ts[i]!=null){
                System.out.println(ts[i].getName() + " " + ts[i].getThreadGroup().getName() + " " + ts[i].getThreadGroup().getParent().getName());
            }
        }
    }
}