package Oppgave3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Kokk extends Thread {

	BlockingQueue<Integer> burgerko;
	public int maxburger = 5;
	int randomsec = ThreadLocalRandom.current().nextInt(2000, 6000);
	public static int burger = 1;

	public Kokk(BlockingQueue<Integer> burgerko) {
		this.burgerko = burgerko;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(randomsec);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			while (burgerko.size() == maxburger) {
				try {
					Thread.sleep(randomsec);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println(
					Thread.currentThread().getName() + " legger p� burger nr. " + burger + burgerko.toString());
			burgerko.add(burger);
			burger++;
		}
	}

}
