package brickBreaker;
import javax.swing.JFrame;

public class BrickBreakerDriver {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("BrickBreaker");
		BrickBreakerPanel panel=new BrickBreakerPanel();
		frame.setSize(700, 1000);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(panel); 
		frame.setVisible(true);
	}

}
