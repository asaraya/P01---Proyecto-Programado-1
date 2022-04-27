package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

import logic.CodeBreaker;
import logic.CodeMaker;

public class MasterMind {

	public static void main(String[] args) {
		JFrame appFrame = new JFrame("MasterMind");
		appFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Grid appGrid = new Grid();
		
		appFrame.add(appGrid);
		appFrame.setSize(new Dimension(520, 1000));
		appFrame.setPreferredSize(new Dimension(400, 600));
		appFrame.setResizable(false);
		appFrame.setVisible(true);
		appFrame.setBackground(Color.BLACK);
		appFrame.setLocationRelativeTo(null);
		
		
		
		
		
	}
	
	
	

}
