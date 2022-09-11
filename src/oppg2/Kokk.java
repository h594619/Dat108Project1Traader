package oppg2;

public class Kokk extends Thread {
	
	private BurgerBrett burgerbrett;
	private String kokkenavn;
	
	public Kokk(BurgerBrett burgerbrett, String kokkenavn) {
		this.burgerbrett = burgerbrett;
		this.kokkenavn = kokkenavn;
	}
	
	@Override
	public void run() {
		while(true) {
			
			try {
				int sleepTime = (int) ((Math.random() * (6 - 2 + 1) + 2));
				Thread.sleep(sleepTime * 1000);
			} catch(InterruptedException e) {
			}
			burgerbrett.leggTil(kokkenavn);
		}
	}
}
