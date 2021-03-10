package GUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Pane extends JPanel {
	
	public Pane () {
		this.setBackground(Color.ORANGE);
		this.setLayout(new GridLayout(4, 3));
		buttons();
	}
	public void buttons() {
		JButton A1 =new JButton("1");
		JButton A2 =new JButton("2");
		JButton A3 =new JButton("3");
		
		JButton B1 =new JButton("4");
		JButton B2 =new JButton("5");
		JButton B3 =new JButton("6");
		
		JButton C1 =new JButton("6");
		JButton C2 =new JButton("7");
		JButton C3 =new JButton("8");
				
		
		this.add(A1);
		this.add(A2);
		this.add(A3);
		
		this.add(B1);
		this.add(B2);
		this.add(B3);
		
		this.add(C1);
		this.add(C2);
		this.add(C3);
		
		
		
		
	}

}
