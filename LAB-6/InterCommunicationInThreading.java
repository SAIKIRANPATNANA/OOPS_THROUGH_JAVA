public class InterCommunicationInThreading{	
	  public static void main(String[] args) throws InterruptedException {	
		  AccountCheck a = new AccountCheck(2000);
	    Thread thr1 = new Thread(new Runnable() {
	      public void run() {
	        a.withdraw(10000);
	      }
	    });
	    Thread thr2 = new Thread(new Runnable() {
	      public void run() {
	        a.deposit_amount(20000);
	      }
	    });
	    
	    thr1.start();
	    thr2.start();
	    thr1.join();
	    thr2.join();
	    System.out.println(a.balance);
	  }
	  }
	  
	  class AccountCheck
	  {
	  public int balance;
	  
	  public AccountCheck(int amount) {
	    this.balance=amount;
	  }
	  public synchronized void withdraw(int withdraw_amount){
	    System.out.println("trying withdrawal");
	    if(withdraw_amount>this.balance)
	        {
	          System.out.println("entering wait state");
	          try {
	      wait();
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	        }
	      System.out.println("reducing balance");
	        this.balance=this.balance-withdraw_amount;
	  }
	  public synchronized void deposit_amount(int deposit) {
	    System.out.println("depositing amount");
	    this.balance=this.balance+deposit;
	    notify();
	  }
	  }