class PingPong {
	int pong = 1;
	public synchronized void ping() throws InterruptedException{
		while(pong==1){
			wait();
		}System.out.println("Ping");
		pong = 1;
		notify();
	}public synchronized void pong() throws InterruptedException{
		while(pong==0){
			wait();
		}System.out.println("Pong");
		pong = 0;
		notify();
	}
}class Ping extends Thread{
	PingPong pingpong;
	Ping(PingPong pingpong){
		this.pingpong = pingpong;
	}public void run(){
		try{
			pingpong.ping();
		}catch(InterruptedException ie){
			System.out.println(ie);
		}
	}
}class Pong extends Thread{
	PingPong pingpong;
	Pong(PingPong pingpong){
		this.pingpong = pingpong;
	}public void run(){
		try{
			pingpong.pong();
		}catch(InterruptedException ie){
			System.out.println(ie);
		}
	}
}public class InterThreadCommunication {
	public static void main(String[] args) {
		PingPong pingpong = new PingPong();
		Ping ping  = new Ping(pingpong);
		Pong pong = new Pong(pingpong);
		ping.start();
		pong.start();
	}
}