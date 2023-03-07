/**
*@author Jorge Altet Zaragoza
*@version 1.2
*/
public class Rectangulo_JAZ extends FiguraGeometrica_JAZ {
	private double l1;
	private double l2;
	
	public Rectangulo(String tipoFigura, double lG, double lP) {
		/**
		*se le pasan 3 parametros al constructor,un struing y dos double
		*/
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	@Override
	public double area() {
	/**
	*este metodo calcula el area
	*/
		return l1 * l2;/**
		*devuelve el resultado de l1 * l2 que sera un resultado de tipo double
		*/
	}
	
	@Override
	public double perimetro() {
	/**
	*este metodo calcula el perimetro
	*/
		return (2 * l1) + (2 * l2);
		/**
		*devuelve el resultado de 2 * l1 + 2*l2 que sera un double
		*/
	}

}
