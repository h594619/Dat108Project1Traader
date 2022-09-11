package oppg2;

public class Servitor extends Thread {
	
	private BurgerBrett burgerbrett;
	private String servitornavn;
	
	public Servitor(BurgerBrett burgerbrett, String servitornavn) {
		this.burgerbrett = burgerbrett;
		this.servitornavn = servitornavn;
	}
	
	public void run() {
while(true) {
			
			try {
				int sleepTime = (int) ((Math.random() * (6 - 2 + 1) + 2));
				Thread.sleep(sleepTime * 1000);
			} catch(InterruptedException e) {
			}
			burgerbrett.taFra(servitornavn);
		}
	}
}
