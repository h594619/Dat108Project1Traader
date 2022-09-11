package oppg1utkast;

import javax.swing.JOptionPane;

public class Threads implements Runnable {

	public static String input;
	
	private static boolean fortsette = true;

	static void stopp() {
		fortsette = false;
	}
	
	public static void startPrint() {
		
		
		while(fortsette){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			if(input != null) {
				System.out.println(input);
			}
		}
	}

	public static void startInput() {
		
		
		
		while(fortsette) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			input = JOptionPane.showInputDialog("Skriv inn din melding, 'quit' for å avbryte");	
			if(input == "quit") {
				SysOutPrintlnJOptionPane.stopp();
			}
		}

	}

	@Override
	public void run() {
		
		while(fortsette){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			if(input != null) {
				System.out.println(input);
			}
		}

	}
}

/*static Thread printlnTraad = new Thread(new Runnable() {
	@Override
	public void run() {



	}
	});
	static Thread giVerdiTraad = new Thread(new Runnable() {
			@Override
			public void run() {


			}
	});

}

		/*		while (input == null) {
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
					}
				}
				while (input != null && !quit) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
					}						

						System.out.println(input);	
					}

				}
			});*/






