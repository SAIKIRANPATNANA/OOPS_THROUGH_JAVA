class ChildThread extends Thread {
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("ChildThread");
            try{
                Thread.sleep(3000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}public class ThreadingMethods2{
    public static void main(String[] args) throws Exception {
        ChildThread ct = new ChildThread();
        ct.start();
        ct.join();
        for(int i=0; i<3; i++){
            System.out.println("MainThread");
        }
    }
}