package ui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameOver{
	
	Screen screen;

	
	public GameOver(Screen pScreen) {
		this.screen = pScreen;
		JFrame gameOver = new JFrame("Select an Option");
		gameOver.setSize(new Dimension(330, 100));
		gameOver.setResizable(false);
		gameOver.setVisible(true);
		gameOver.setBackground(Color.BLACK);
		gameOver.setLocationRelativeTo(null);
		
		JLabel isOver = new JLabel();
		isOver.setText("Sus Turnos se han terminado. ¿Desea Jugar de nuevo?");
		
		JButton yes = new JButton("Yes");
		JButton no = new JButton("No");
		JButton cancel = new JButton("Cancel");
		
		JPanel gameOverPoto = new JPanel();
		gameOver.add(gameOverPoto);
		gameOverPoto.setBounds(15, 15, 475, 720);
		gameOverPoto.setBackground(Color.white);
		
		
		yes.setBounds(20, 20, 20, 20);
		no.setBounds(40, 20, 20, 20);
		cancel.setBounds(60, 20, 20, 20);
		
		gameOverPoto.add(isOver);
		gameOverPoto.add(yes);
		gameOverPoto.add(no);
		gameOverPoto.add(cancel);
		
		yes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent action) {
				System.out.println("Clicked");
				gameOver.setVisible(false);
				screen.setNewGame();
			}
		});
		no.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent action) {
				System.out.println("Clicked");
				System.exit(0);
			}
		});
		cancel.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent action) {
				System.out.println("Clicked");
				System.exit(0);
			}
		});
	}
	
	/**
	 * Función que reinicia los turnos de la partida para volver a empezar
	 * @param  Esta función no recibe parámetros
	 * @return int devuelve 0
	 **/
	public int resetTurns() {
		return 0;
	}
	
}
