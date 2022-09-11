package oppg1;

import javax.swing.JOptionPane;

public class TraadInput extends Thread {
	
	private boolean fortsette;
	private Melding melding;
	
	public TraadInput(Melding melding) {
		fortsette = true;
		this.melding = melding;
	}
	
	@Override
	public void run() {
		String input;
		input = JOptionPane.showInputDialog("Skriv inn din melding, 'quit' for å avbryte");
		
	}
}
