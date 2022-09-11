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
		while(fortsette) {
			
			String output = "";
			try {
				output = melding.getInput();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(output.equals("quit")){
				fortsette = false;
			}else {
				System.out.println(output);
			}
			
		}
		
	}

}
