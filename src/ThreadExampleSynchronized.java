
public class ThreadExampleSynchronized {
	public static void main(String [] args){
		Counter counterA = new Counter();
		CounterThread threadA = new CounterThread(counterA);
		CounterThread threadB = new CounterThread(counterA);
	threadA.start();
	threadB.start();
	
	}

}
