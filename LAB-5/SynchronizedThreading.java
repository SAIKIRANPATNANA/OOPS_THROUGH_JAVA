class Counter{
    int count = 0;
    public synchronized void increment(){
        count++;
    }public synchronized void decrement(){
        count--;
    }public int getCount(){
        return count;
    }
}class IncrementThread extends Thread{
    Counter counter;
    IncrementThread(Counter counter){
        this.counter = counter;
    }public void run(){
        for(int i=0; i<10; i++){
            counter.increment();
        }
    }
}class DecrementThread extends Thread{
    Counter counter;
    DecrementThread(Counter counter){
        this.counter = counter;
    }public void run(){
        for(int i=0; i<10; i++){
            counter.decrement();
        }
    }
}public class SynchronizedThreading{
    public static void main(String[] args) {
        Counter counter = new Counter();
        IncrementThread increment_thread = new IncrementThread(counter);
        DecrementThread decrement_thread = new DecrementThread(counter);
        increment_thread.start();
        decrement_thread.start();
        try{
            increment_thread.join();
            decrement_thread.join();
        }catch(Exception e){
            System.out.println(e);
        }System.out.println(counter.getCount());
    }
}