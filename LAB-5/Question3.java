import java.io.IOException;
import java.util.InputMismatchException;
class TicketBooking{
    static int tickets = 100;
    static int seats[] = new int[100];
    public static synchronized void bookTicket(){
        tickets--;
        seats[tickets]++;
    }
}class BookTicket extends Thread{
    public void run(){
        for(int i=0; i<20; i++){
            TicketBooking.bookTicket();
        }
    }
}public class Question3 {
   public static void main(String[] args) throws Exception {
    try {
        int a = 1/1;
    }catch (ArithmeticException e){
        System.out.println(e);
    }catch (InputMismatchException e){
        System.out.println(e);
    }catch(Exception e){
        System.out.println(e);
    }BookTicket bt1 = new BookTicket();
    BookTicket bt2 = new BookTicket();
    bt1.start();
    bt2.start();
    bt1.join();
    bt2.join();
    System.out.println(TicketBooking.tickets);
   }
}
