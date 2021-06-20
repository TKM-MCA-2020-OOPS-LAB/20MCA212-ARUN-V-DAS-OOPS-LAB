package CO_4;

import java.util.ArrayList;
import java.util.List;

class Producer implements Runnable{
	List<Integer> SharedList;
	
	public Producer(List<Integer>SharedList) {
		this.SharedList=SharedList;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
			try{
				synchronized(SharedList) {
					while(true) {
						if(SharedList.size()>0) {
							System.out.println("List is full, waiting for the consumer to consume");	
							SharedList.wait();
							}
						else 
							produce();
					}
				}
			}	
			catch(InterruptedException e) {
			}
	}
		
	private void produce() throws InterruptedException {
		for (int i=1;i<=5;i++){
			Thread.sleep(1000);
			SharedList.add(i);
			System.out.println("Producer produce the element:"+i);
		}
		SharedList.notify();
	}	
}

class Consumer implements Runnable{
	List<Integer> SharedList=null;

	public Consumer(List<Integer>SharedList) {
		this.SharedList=SharedList;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
			try{
				while(true) {
					synchronized(SharedList) {
						if(SharedList.size()==0) {
							System.out.println("List is empty, waiting for producer to produce");
							SharedList.wait();
						}
						else 
							consume();
					}
				}
			}
			catch(InterruptedException e) {
			}
	}

	private void consume() throws InterruptedException {		
		while(!SharedList.isEmpty()) {
			Thread.sleep(1000);
			System.out.println("Consumer consumes the element:"+SharedList.remove(0));
			}
			SharedList.notify();
	}
}
public class co4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ShareList=new ArrayList<Integer>();
		Thread t1=new Thread(new Producer(ShareList));
		Thread t2=new Thread(new Consumer(ShareList));
		t1.start();
		t2.start();
	}

}
