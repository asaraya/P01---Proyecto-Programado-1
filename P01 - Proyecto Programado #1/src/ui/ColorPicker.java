package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorPicker extends JPanel{
	Grid grid;
	
	JButton guess_1 = new CircleButton("1");
	JButton guess_2 = new CircleButton("2");
	JButton guess_3 = new CircleButton("3");
	JButton guess_4 = new CircleButton("4");
	
	
	public ColorPicker(Grid pGrid) {
		this.grid = pGrid;
		this.setLayout(new GridLayout(1,6));
		
		this.setLocation(0,750);
		this.setPreferredSize(new Dimension(50,50));
		
		JLabel lbl_1 = new JLabel(" ");
		JLabel lbl_2 = new JLabel(" ");
		JLabel lbl_3 = new JLabel(" ");
		JLabel lbl_4 = new JLabel(" "); 
		JLabel lbl_5 = new JLabel(" "); 
		
		this.add(guess_1);
		this.add(lbl_1);
		this.add(guess_2);
		this.add(lbl_2);
		this.add(guess_3);
		this.add(lbl_3);
		this.add(guess_4);
		this.add(lbl_4);
		this.add(lbl_5);
	
		
	}
}
