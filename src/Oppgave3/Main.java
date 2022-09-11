package Oppgave3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> burgerko = new LinkedBlockingQueue<Integer>();
		
		Thread kokk1 = new Kokk(burgerko);
		kokk1.setName("Anne");
		Thread kokk2 = new Kokk(burgerko);
		kokk2.setName("Erik");
		Thread kokk3 = new Kokk(burgerko);
		kokk3.setName("Knut");

		Thread servitor1 = new Servitor(burgerko);
		servitor1.setName("Mia");
		Thread servitor2 = new Servitor(burgerko);
		servitor2.setName("Per");

		kokk1.start();
		kokk2.start();
		kokk3.start();
		servitor1.start();
		servitor2.start();
		
	}

}
