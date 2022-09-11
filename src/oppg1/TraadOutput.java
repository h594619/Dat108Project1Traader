package oppg1;

public class TraadOutput extends Thread {
	
	private boolean fortsette;
	private Melding melding;
	
	public TraadOutput(Melding melding) {
		fortsette = true;
		this.melding = melding;
	}
	
	@Override
	public void run() {
		
	}

}
