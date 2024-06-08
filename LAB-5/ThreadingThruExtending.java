class ChildThread extends Thread  {
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("Child Thread");
        }
    }
}public class ThreadingThruExtending{
    public static void main(String[] args) {
        ChildThread ct = new ChildThread();
        ct.start();
        for(int i=0; i<3; i++){
            System.out.println("Main Thread");
        }
    }
}