class ObjectLevelSync implements Runnable{
    private Object obj = new Object();
    public void run(){
        synchronized(obj){
            for(int i=0; i<5; i++){
                System.out.println("Object Level Synchronisation: "+ ++SynchronizationAtDiffLevels.shared_resrc);
            }
        }
    }
}class ClassLevelSync implements Runnable{
    public void run(){
        synchronized(SynchronizationAtDiffLevels.class){
            for(int i=0; i<5; i++){
                System.out.println("Class Level Synchronisation: "+ ++SynchronizationAtDiffLevels.shared_resrc);
            }
        }
    }
}class BlockLevelSync implements Runnable{
    public void run(){
        synchronized(this){
            for(int i=0; i<5; i++){
                System.out.println("Block Level Synchronisation: "+ ++SynchronizationAtDiffLevels.shared_resrc);
            }
        }
    }
}public class SynchronizationAtDiffLevels {
    public static int shared_resrc = 0;

    public static void main(String[] args) {
        Thread obj_sync = new Thread(new ObjectLevelSync());
        Thread clz_sync = new Thread(new ClassLevelSync());
        Thread blk_sync = new Thread(new BlockLevelSync());
        obj_sync.start();
        clz_sync.start();
        blk_sync.start();
        try{
            obj_sync.join();
            clz_sync.join();
            blk_sync.join();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}