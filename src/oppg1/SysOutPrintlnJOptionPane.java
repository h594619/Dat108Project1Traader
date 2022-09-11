package oppg1;

public class SysOutPrintlnJOptionPane {
	
	private static boolean fortsette = true;
	
static void stopp() {
		fortsette = false;
	}
	
	public static void main(String args[]) throws InterruptedException {
		
		while(fortsette) {
			Threads.startInput();
			Threads.startPrint();
		}
		
	}

}
/*String input = JOptionPane.showInputDialog("Skriv inn din melding, 'quit' for å avbryte");

Thread t = new Thread(new Runnable() {

	@Override
    public void run() {
        //System.out.println("Hallo");
        
    }
});
t.start();
while (input != "quit") {
    Thread tt = new Thread() {
        @Override
        public void run() {
            //System.out.println("Hallo fra " +getName());
            System.out.println(input);
        }
    };
    tt.start();
}
Thread.sleep(3000);

System.out.println("Hallo fra main");
}*/
