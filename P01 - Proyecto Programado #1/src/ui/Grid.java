package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.CodeBreaker;
import logic.CodeMaker;

import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid extends JPanel{

	private int turns;
	
	public Grid() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.turns = 0;
		
		Screen appScreen = new Screen(this);
		ColorPicker appColorPicker = new ColorPicker(this);
		
		appScreen.setBackground(Color.green);
		
		this.add(appScreen);
		this.add(appColorPicker);
		
		JButton boton = new ActionButton("Enviar", this);
		
		CodeMaker maker = new CodeMaker();
		maker.generateCode();
		
		CodeBreaker breaker = new CodeBreaker();
		
		boton.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent action) {
				
				Color newColor1 = appColorPicker.guess_1.getBackground();
				Color newColor2 = appColorPicker.guess_2.getBackground();
				Color newColor3 = appColorPicker.guess_3.getBackground();
				Color newColor4 = appColorPicker.guess_4.getBackground();
				
				appScreen.getBoardButtons().get((36) - (turns*4)).setBackground(newColor1);
				appScreen.getBoardButtons().get((36) - (turns*4)).repaint();
				appScreen.getBoardButtons().get((37) - (turns*4)).setBackground(newColor2);
				appScreen.getBoardButtons().get((37) - (turns*4)).repaint();
				appScreen.getBoardButtons().get((38) - (turns*4)).setBackground(newColor3);
				appScreen.getBoardButtons().get((38) - (turns*4)).repaint();
				appScreen.getBoardButtons().get((39) - (turns*4)).setBackground(newColor4);
				appScreen.getBoardButtons().get((39) - (turns*4)).repaint();
				
				breaker.makeGuess(newColor1, newColor2, newColor3, newColor4);
			
				
				
				if (breaker.getCode().equals(maker.getCode())) {
					GameOver gameOver = new GameOver(appScreen);
					turns = gameOver.resetTurns();
					maker.generateCode();
					for (int i = 0; i < 4; i++) {
						appScreen.getHintsButtons().get(36 + i - (turns * 4)).setBackground(Color.white);
						appScreen.getHintsButtons().get(36 + i - (turns * 4)).repaint();
					}
					
				} else {
					ArrayList<Integer> hintPositions = new ArrayList<Integer>();
					
					for (int y = 0; y < 4; y++) {
						hintPositions.add(36 + y);
					}
					ArrayList<Integer> tempMaker = new ArrayList<Integer>();

					for (int i = 0; i < breaker.getCode().size(); i++) {
					    if (breaker.getCode().get(i).equals(maker.getCode().get(i))){
					        tempMaker.add(1);
					    } else {
					    	tempMaker.add(0);
					    }
					}
					for (int j = 0; j < maker.getCode().size(); j++) {
						if (tempMaker.get(j) == 1)
							continue;
		    			for (int k = 0; k < breaker.getCode().size(); k++) { 	
		    				if (maker.getCode().get(j).equals(breaker.getCode().get(k)) && tempMaker.get(k)==0) {
				    			tempMaker.set(k,2);
				    			break;
				    		}
		    				
		    			}
			    		
			    	}
									
					for (int k = 0; k < tempMaker.size(); k++){   	
				    	Color color;
				        if (tempMaker.get(k) == 1){
				        	color = Color.red;
				        } else if (tempMaker.get(k) == 2){
				        	color = Color.white;
				        } else {
				            color = Color.gray;
				        }
				     
				        Random randomPosition = new Random();
				        int poto3 = hintPositions.size() - 1;
				        
				        
				        if (poto3 <= 0)
				            poto3 = 1;
				        int position = randomPosition.nextInt(poto3);
				        
				        int hintPosition = hintPositions.get(position);
				        hintPositions.remove(position);
				        appScreen.getHintsButtons().get(hintPosition - (turns * 4)).setBackground(color);
				        appScreen.getHintsButtons().get(hintPosition - (turns * 4)).repaint();
					}
					
					turns++;
				}
				
				
				
				if (turns == 10) {
					GameOver gameOver = new GameOver(appScreen);
					turns = gameOver.resetTurns();
					maker.generateCode();
				}
				
			}
		});
		
		boton.setPreferredSize(new Dimension(600,40));
		System.out.println(turns);	
		this.add(boton);
		this.add(new JLabel("        "));
	}
	
	/*
	public int getTurns() {
		return this.turns;
	}
	
	public void setTurns(int pTurns) {
		this.turns = pTurns;
	}
	*/
	
}
