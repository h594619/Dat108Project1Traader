package oppg1;

public class Main {
	public static void main(String[] args) {
		
		Melding melding = new Melding();
		TraadOutput print = new TraadOutput(melding);
		TraadInput input = new TraadInput(melding);
		
		print.start();
		input.start();
	}
}
