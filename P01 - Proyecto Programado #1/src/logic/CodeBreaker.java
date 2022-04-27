package logic;

import java.awt.Color;
import java.util.ArrayList;
import ui.*;

public class CodeBreaker {

	ArrayList<Color> breakerCode = new ArrayList<Color>();

	
	public CodeBreaker() {}
	
	/**
	 * Función que le permite al usuario crear un patrón de colores para resolver
	 * el código generado por la computadora, el código se envía a un arreglo que
	 * se usará para comparar el código del CodeMaler
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
	 * Esta Función ayuda a retornar la lista de colores que el usuario
	 * generó a partir de los botones.
	 * @param  Esta función no recibe parámetros
	 * @return ArrayList<Color> retorna el código generado por el CodeBreaker
	 **/
	public ArrayList<Color> getCode() {
		return this.breakerCode;
	}
}
