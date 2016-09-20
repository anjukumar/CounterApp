public class Mom extends Thread {
	public void run() {
		for (int x = 0; x < 1000; x++) {
			try {
				this.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("**********mom***********");
			// System.out.println(this.getName() + " : " +counter.getCounter());
		}
	}
}
