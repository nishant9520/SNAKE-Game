import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		Window f1= new Window();
		
		//Setting up the window settings
		f1.setTitle("Snake");
		f1.setSize(500,500);
                //f1.pack();
                f1.setLocationRelativeTo(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	}
}
