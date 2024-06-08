class Counter{
    int count = 20;
    public synchronized void increment(){
        count++;
    }public synchronized void decrement(){
        count--;
    }
}class IncrementThread extends Thread{
    Counter counter;
    IncrementThread(Counter counter){
        this.counter = counter;
    }public void run(){
        for(int i=0; i<15; i++){
            counter.increment();
        }return;
    }
}class DecrementThread extends Thread{
    Counter counter;   
    DecrementThread(Counter counter){
        this.counter = counter;
    }public void run(){
        this.counter = counter;
        for(int i=0; i<10; i++){
            counter.decrement();
        }return;
    }
}public class SynchronizedThreading {
    public static void main(String args[]){
        Counter counter = new Counter();
        IncrementThread increment_thread = new IncrementThread(counter);
        DecrementThread decrement_thread = new DecrementThread(counter);
        try{
            increment_thread.start();
            decrement_thread.start();
            increment_thread.join();
            decrement_thread.join();
        }catch(Exception e){
            System.out.println(e);
        }System.out.println(counter.count);
    }
}