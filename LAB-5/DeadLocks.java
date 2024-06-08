class Resource {
    public void doFun(){
        System.out.println("Fun Off!");
        return;
    }
}class Thread1 extends Thread {
    Resource r1;
    Resource r2;
    Thread1(Resource r1, Resource r2){
        this.r1 = r1;
        this.r2 = r2;
    }public void run(){
        synchronized(r1){
            r1.doFun();
            System.out.out("Thread1 locked Resource1");
        }try{
            this.sleep(100);
        }catch(Exception e){
            System.out.println(e);
        }synchronized(r2){
            r2.doFun();
            System.out.println("Thread1 locked Resource2");
        }return;
    }
}class Thread2 extends Thread {
    Resource r1;
    Resource r2;
    Thread2(Resource r1, Resource r2){
        this.r1 = r1;
        this.r2 = r2;
    }public void run(){
        synchronized(r2){
            r2.doFun();
            System.out.println("Thread2 locked Resource2");
        }try{
            this.sleep(100);
        }catch(Exception e){
            System.out.println(e);
        }synchronized(r1){
            r1.doFun();();
            System.out.println("Thread2 locked Resource1");
        }return;
    }
}public class DeadLocks{
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();
        Thread1 t1 = new Thread1(r1,r2);
        Thread2 t2 = new Thread2(r1,r2);
        t1.start();
        t2.start();
    }
}