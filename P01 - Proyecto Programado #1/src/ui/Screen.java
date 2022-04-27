package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Screen extends JPanel{
	Grid grid;
	int buttonX, buttonY, hintX, hintY;
	private ArrayList<CircleBoardButton> buttons = new ArrayList<CircleBoardButton>();
	private ArrayList<CircleBoardButton> hints = new ArrayList<CircleBoardButton>();
	
	
	public Screen(Grid pGrid) {
		this.grid = pGrid;
		this.setLayout(null);
		this.setPreferredSize(new Dimension(600, 650));
		this.setBackground(new Color(0, 190, 0));
		
		this.buttonX = 20;
		this.buttonY = 20;
		this.hintX = 420;
		this.hintY = 20;
		
		this.buttons = new ArrayList<CircleBoardButton>();
		this.hints = new ArrayList<CircleBoardButton>();
		
		for(int i=0; i<40;i++){
			CircleBoardButton boton = new CircleBoardButton("1");
			this.buttons.add(boton);
		}
		
		for(int i=0; i<40; i++) {
			this.buttons.get(i).setBackground(Color.gray);
			this.buttons.get(i).repaint();
		}
		
		for(int i=0; i<40;i++){
			CircleBoardButton hint = new CircleBoardButton("1");
			this.hints.add(hint);
		}
		
		for(int i=0; i<40; i++) {
			this.hints.get(i).setBackground(Color.gray);
			this.hints.get(i).repaint();
		}
		
		for(int i=0; i<40;i++){
			if (i%4 == 0 && i!=0) {
				this.buttonX = this.buttonX - 400;
				this.buttonY = this.buttonY + 70;
			}			
			this.buttons.get(i).setBounds(buttonX, buttonY, 40, 40);
			this.buttonX = this.buttonX + 100;
		}
		
		
		for(int i=0; i<40;i++){
			this.add(this.buttons.get(i));
		}
		
		
		for(int i=0; i<40;i++){
			if (i%2 == 0 && i!=0) {
				this.hintX = this.hintX + 22;
				this.hintY = this.hintY - 40;
			} 
			if (i%4 == 0 && i!=0) {
				this.hintY = this.hintY + 70;
				this.hintX = this.hintX - 44;
			}
			this.hints.get(i).setBounds(hintX, hintY, 20, 20);
			this.hintY = this.hintY + 20;
		}
		
		for(int i=0; i<40;i++){
			this.add(this.hints.get(i));
		}
		
		
		JPanel poto = new JPanel();
		this.add(poto);
		poto.setBounds(15, 15, 475, 720);
		poto.setBackground(Color.LIGHT_GRAY);
		
		
	}
	
	/**
	 * Función que retorna la lista con todos botones de adivinanza del tablero
	 * @param  Esta función no recibe parámetros
	 * @return ArrayList<Color> retorna el arreglo de botones tablero del tipo CircleBoardButton
	 **/
	public ArrayList<CircleBoardButton> getBoardButtons(){
		return this.buttons;
	}
	
	/**
	 * Función que retorna la lista de hints que se crean luego del usuario mandar código
	 * @param  Esta función no recibe parámetros
	 * @return ArrayList<Color> retorna el arreglo de botones hints del tipo CircleBoardButton
	 **/
	public ArrayList<CircleBoardButton> getHintsButtons(){
		return this.hints;
	}
	
	/**
	 * Función que una vez llamada limpia todos los intentos de códigos que mandó el usuario
	 * y todos los hints que generó el sistema
	 **/
	public void setNewGame() {
				
		for(int i=0; i<40; i++) {
			this.buttons.get(i).setBackground(Color.gray);
			this.buttons.get(i).repaint();
			this.hints.get(i).setBackground(Color.gray);
			this.hints.get(i).repaint();
		}

	}
	
}