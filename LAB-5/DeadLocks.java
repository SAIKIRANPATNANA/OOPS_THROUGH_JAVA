class A extends Thread{
    public synchronized void first(B b){
        b.last();
        System.out.println("A is trying to call last of B");
    }public synchronized void last(){
        System.out.println("This is the last method of A");
    }
}class B extends Thread{
    public synchronized void first(A a){
        a.last();
        System.out.println("B is trying to call last of A");
    }public synchronized void last(){
        System.out.println("This is the last method of B");
    }
}public class DeadLocks extends Thread{
    A a = new A();
    B b = new B();
    public void dl(){
        this.start();
        a.first(b);
    }public void run(){
        b.first(a);
    }public static void main(String[] args) {
        DeadLocks dead_locks = new DeadLocks();
        dead_locks.dl();
    }
}
