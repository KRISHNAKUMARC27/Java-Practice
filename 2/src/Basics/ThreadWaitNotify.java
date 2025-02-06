package Basics;

public class ThreadWaitNotify {

	public static void main(String[] args) {
		
		SharedClass shared = new SharedClass();
		
		Thread producer = new Thread(() -> {
			try {
				shared.producer("Hello");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread consumer = new Thread(() -> {
			try {
				shared.consumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		producer.start();
		consumer.start();
	
	}

}

class SharedClass {
	String message;
	Boolean hasMessage = false;
	
	public synchronized void producer(String message) throws InterruptedException {
		while(hasMessage) {
			wait();
		}
		this.message = message;
		hasMessage = true;
		notify();
	}
	
	public synchronized void consumer() throws InterruptedException {
		while(!hasMessage) {
			wait();
		}
		System.out.println(message);
		hasMessage = false;
		notify();
	}
}
