package ui;

import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CircleBoardButton extends JButton{


	public CircleBoardButton(String text){
		super(text);
		setOpaque(false);
		setFocusPainted(false);
		setBorderPainted(false);
	}
	/**
	 * Función que retorna el diametro de un objeto
	 * @param  Esta función no recibe parámetros
	 * @return int retorna el diámetro de un objeto con el uso de la clase math
	 **/
	private int getDiameter(){
		int diameter = Math.min(getWidth(), getHeight());
		return diameter;
	}
	
	@Override
	public Dimension getPreferredSize(){
		FontMetrics metrics = getGraphics().getFontMetrics(getFont());
		int minDiameter = 10 + Math.max(metrics.stringWidth(getText()), metrics.getHeight());
		return new Dimension(minDiameter, minDiameter);
	}
	
	@Override
	public boolean contains(int x, int y){
		int radius = getDiameter()/2;
		return Point2D.distance(x, y, getWidth()/2, getHeight()/2) < radius;
	}
	
	@Override
	public void paintComponent(Graphics g){
		int diameter = getDiameter();
		int radius = diameter/2;
		
        g.setColor(this.getBackground());
		g.fillOval(getWidth()/2 - radius, getHeight()/2 - radius, diameter, diameter);
		g.drawOval(getWidth()/2 - radius, getHeight()/2 - radius, diameter, diameter);
	}
	
	
}