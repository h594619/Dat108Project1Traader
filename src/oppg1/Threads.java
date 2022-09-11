package oppg1;

import javax.swing.JOptionPane;
	
public class Threads implements Runnable {
	
	public static String input;
	public static void startPrint() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println(input);
	}
	
	public static void startInput() {
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
		}
		input = JOptionPane.showInputDialog("Skriv inn din melding, 'quit' for å avbryte");	
		if(input == "quit") {
			SysOutPrintlnJOptionPane.stopp();
		}else if(input != null) {
			startPrint();
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
	
	
		
	
	

