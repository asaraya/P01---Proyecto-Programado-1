package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.CodeBreaker;
import logic.CodeMaker;

import javax.swing.JButton;

public class ActionButton extends JButton{
	
	Grid grid;
	CodeBreaker breaker = new CodeBreaker();
	JButton btnGuess1 = new CircleButton("1");
	JButton btnGuess2 = new CircleButton("1");
	JButton btnGuess3 = new CircleButton("1");
	JButton btnGuess4 = new CircleButton("1");
	
	public ActionButton(String display, Grid pGrid) {
		super(display);
		this.grid = pGrid;
		
		/*this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setSize(40, 40);
        this.setMinimumSize(new Dimension(40, 40));*
        
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent action) {
				System.out.println("Clicked");
				
			}
		});*/
	}
	
}
