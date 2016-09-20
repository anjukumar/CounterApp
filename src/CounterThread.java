public class CounterThread extends Thread{

	private Counter counter = null;
	public CounterThread(Counter counter){
		this.counter=counter;
	}
	public void run (){
		for(int i=0;i<1000;i++){
			try {
				CounterThread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter.add(100);
			System.out.println(this.getName() + " : " +counter.getCounter());
		}

	}
	
}