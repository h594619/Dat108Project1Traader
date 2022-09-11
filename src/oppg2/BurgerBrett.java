package oppg2;

import java.util.LinkedList;

public class BurgerBrett {
	
	private int burgercap;
	private int antall;
	private int burgerid;
	private LinkedList<Burger> burgerqueue;
		
	public BurgerBrett(int burgercap) {
		this.burgercap = burgercap;
		antall = 0;
		burgerid = 1;
		burgerqueue = new LinkedList<Burger>();
	}
	
	public synchronized void leggTil(String kokkenavn) {
		Burger burger = new Burger();
		if (antall >= burgercap) {
			System.out.println(kokkenavn + " vil legge på hamburger, men brettet er fullt. Venter...");
			try {
				wait();
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		tellOpp();
		burger.setBurger(burgerid);
		burgerid++;
		burgerqueue.add(burger);
		System.out.println(kokkenavn + " legger på burger [" + burger.getBurger() + "]. Brett: " + toString());
		if (antall < burgercap) {
			notify();
		}
		
		
			
		
	}
	
	public synchronized void taFra(String servitornavn) {
		if (antall < 1) {
			System.out.println(servitornavn + " vil ta av hamburger, men brettet er tomt. Venter...");
			try {
				wait();
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		tellNed();
		int burgerTatt = burgerqueue.poll().getBurger();
		System.out.println(servitornavn + " tar av hamburger [" + burgerTatt + "]. Brett: " + toString());
		if (antall > 0) {
			notify();
		}
	}
	
	public void tellOpp() {
		antall++;
	}
	
	public void tellNed() {
		antall--;
	}
	
	public int sjekkBrett() {
		return antall;
	}
	
	public String toString() {
        String tekst = "[";
        for(Burger b: burgerqueue) {
            tekst += "(" + b.getBurger() + ")";
        }
        tekst += "]";
        return tekst;
    }
}
