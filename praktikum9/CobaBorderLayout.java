package praktikum9;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CobaBorderLayout extends JFrame {

	public CobaBorderLayout() {
		// TODO Auto-generated method stub
		super("Coba borderlayout");
		setSize(500, 300);
		createLayout();		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void createLayout() {
		add(BorderLayout.NORTH, new JButton("North"));
		add(BorderLayout.SOUTH, new JButton("south"));
		add(BorderLayout.EAST, new JButton("EAST"));
		add(BorderLayout.WEST, new JButton("WEST"));
		add(BorderLayout.CENTER, new JButton("center"));
	}

	public static void main(String[] args) {
		new CobaBorderLayout();
	}
}
