package praktikum9;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class CobaGUI {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame=new JFrame("Halo string");
		JLabel label=new JLabel("Tes label");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,200);
		frame.setVisible(true);
	}

}
