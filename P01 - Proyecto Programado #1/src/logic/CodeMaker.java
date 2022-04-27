package logic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class CodeMaker {
	
	private ArrayList<Color> makerCode = new ArrayList<Color>();
	
	public CodeMaker() {}
	
	/**
	 * Esta funci�n funciona de manera que cuando se construya un objeto de tipo CodeMaker
	 * se genere un arreglo de colores aleatorios.
	 * @param  Esta funci�n no recibe par�metros
	 **/
	public void generateCode() {
		makerCode = new ArrayList<Color>();
		Random random = new Random();
		int randomNumber;
		
		for(int i = 0; i < 4; i++) {
			 randomNumber = random.nextInt(5);
			 
			if (randomNumber == 0) {
				System.out.println("verde");
				makerCode.add(Color.green);
				
			} else if(randomNumber == 1) {
				System.out.println("amarillo");
				makerCode.add(Color.yellow);
				
			} else if(randomNumber == 2) {
				System.out.println("celeste");
				makerCode.add(Color.cyan);
			} else if(randomNumber == 3) {
				System.out.println("naranja");
				makerCode.add(Color.orange);
			} else if(randomNumber == 4) {
				System.out.println("morado");
				makerCode.add(Color.magenta);
			}
		}
		
		for (int i = 0; i < makerCode.size(); i++) {
			System.out.print("[" + makerCode.get(i) + "]" + " ");
		}
	}
	
	/**
	 * Esta funci�n ayuda a retornar la lista de colores aleatorios generados
	 * por la funci�n random
	 * @param  Esta funci�n no recibe par�metros
	 * @return ArrayList<Color> retorna el c�digo generado por el CodeMaker
	 **/
	public ArrayList<Color> getCode() {
		return this.makerCode;
	}

}
