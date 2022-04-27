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

public class CircleButton extends JButton{
	
	private boolean mouseOver = false;
	private boolean mousePressed = false;
	private int times = 1;
	private String colorName;


	public CircleButton(String text){
		super(text);
		setOpaque(false);
		setFocusPainted(false);
		setBorderPainted(false);
		
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent action) {
					if(times == 1) {
						times++;
						setColorName("VERDE");
						
					} else if (times == 2) {
						times++;
						setColorName("AMARILLO");
						
					} else if (times == 3) {
						times++;
						setColorName("CELESTE");
						
					} else if (times == 4) {
						times++;
						setColorName("NARANJA");
						
					} else if (times == 5) {
						times = 1;
						setColorName("MORADO");
						
					}
				
				
			}
		});
		
		MouseAdapter mouseListener = new MouseAdapter(){
			
			@Override
			public void mousePressed(MouseEvent me){
				if(contains(me.getX(), me.getY())){
					mousePressed = true;
					repaint();
				}
			}
			
			@Override
			public void mouseReleased(MouseEvent me){
				mousePressed = false;
				repaint();
			}
			
			@Override
			public void mouseExited(MouseEvent me){
				mouseOver = false;
				mousePressed = false;
				repaint();
			}
			
			@Override
			public void mouseMoved(MouseEvent me){
				mouseOver = contains(me.getX(), me.getY());
				repaint();
			}	
		};
		
		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);		
	}
	
	/**
	 * Función que retorna el nombre que se le asigna al botón cada vez que se cambia el color
	 * @param  Esta función no recibe parámetros
	 * @return String retorna el nombre del color asignado al botón
	 **/
	public String getColorName() {
		return this.colorName;
	}
	/**
	 * Función que cambia el nombre al botón cuando cambia de color
	 * @param  Esta función no recibe parámetros
	 **/
	public void setColorName(String pName) {
		this.colorName = pName;
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
		
		if(mousePressed){
			if(times == 1) {
				g.setColor(Color.green);
				this.setBackground(Color.green);
			} else if (times == 2) {
				g.setColor(Color.yellow);
				this.setBackground(Color.yellow);
			} else if (times == 3) {
				g.setColor(Color.CYAN);
				this.setBackground(Color.CYAN);
			} else if (times == 4) {
				g.setColor(Color.orange);
				this.setBackground(Color.orange);
			} else if (times == 5) {
				g.setColor(Color.magenta);
				this.setBackground(Color.magenta);
			}
		} else {
			if(times == 1) {
				g.setColor(Color.green);
				this.setBackground(Color.green);
			} else if (times == 2) {
				g.setColor(Color.yellow);
				this.setBackground(Color.yellow);
			} else if (times == 3) {
				g.setColor(Color.CYAN);
				this.setBackground(Color.CYAN);
			} else if (times == 4) {
				g.setColor(Color.orange);
				this.setBackground(Color.orange);
			} else if (times == 5) {
				g.setColor(Color.magenta);
				this.setBackground(Color.magenta);
			}
		}
		g.fillOval(getWidth()/2 - radius, getHeight()/2 - radius, diameter, diameter);
		g.drawOval(getWidth()/2 - radius, getHeight()/2 - radius, diameter, diameter);
		
	}
	
	
}