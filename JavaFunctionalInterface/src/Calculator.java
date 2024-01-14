/**
 * Calculator Class
 */


public class Calculator  implements Runnable{

	/**
	 * Default Constructor
	 */
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * run method
	 */
	public void run() {
		System.out.println("Running");
	}
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		Thread thread = new Thread(calculator);
		thread.start();

	}

}
