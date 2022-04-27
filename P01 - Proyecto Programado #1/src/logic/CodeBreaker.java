package logic;

import java.awt.Color;
import java.util.ArrayList;
import ui.*;

public class CodeBreaker {

	ArrayList<Color> breakerCode = new ArrayList<Color>();

	
	public CodeBreaker() {}
	
	/**
	 * Funci�n que le permite al usuario crear un patr�n de colores para resolver
	 * el c�digo generado por la computadora, el c�digo se env�a a un arreglo que
	 * se usar� para comparar el c�digo del CodeMaler
	 * @param  Color
	 **/
	public void makeGuess(Color pColor1, Color pColor2, Color pColor3, Color pColor4) {
		breakerCode = new ArrayList<Color>();
		breakerCode.add(pColor1);
		breakerCode.add(pColor2);
		breakerCode.add(pColor3);
		breakerCode.add(pColor4);
	}
	
	/**
	 * Esta Funci�n ayuda a retornar la lista de colores que el usuario
	 * gener� a partir de los botones.
	 * @param  Esta funci�n no recibe par�metros
	 * @return ArrayList<Color> retorna el c�digo generado por el CodeBreaker
	 **/
	public ArrayList<Color> getCode() {
		return this.breakerCode;
	}
}
