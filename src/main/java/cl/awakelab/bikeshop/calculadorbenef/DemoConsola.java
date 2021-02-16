package cl.awakelab.bikeshop.calculadorbenef;

import java.util.ArrayList;
import java.util.List;

public class DemoConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ventas = new ArrayList<Integer>();
//		ventas.add(136);
//		ventas.add(460);
//		ventas.add(395);
//		ventas.add(122);
//		ventas.add(441);
//		ventas.add(256);
//		ventas.add(1690);
//		ventas.add(699);
//		ventas.add(525);
//		ventas.add(654);
		System.out.println("-----------------------------------------------");
		System.out.println("Demostración Cálculo Beneficios para Vendedores");
		System.out.println("-----------------------------------------------");
		System.out.println("\nTomando 10 valores de montos de venta aleatorios...");
		
		/**
		 * Generar numero aleatorios para la lita
		 */
		for (int i = 0; i < 10; i++) {			
			
			//System.out.print(ventas.get(i) + " ");
			
			//	Número aleatorio
			int random = (int) Math.round((Math.random() * (2000-100)) +100);
			//	Se agrega a la lista
			ventas.add(random);
			//	Se muestra por consola
			System.out.print(random + " ");
		}
		
		/**
		 * 	Mostrar en pantalla los resultados de cada calculo
		 */
		
		//	ALGORITMO SIMPLE
		CalculadoraSimple cs = new CalculadoraSimple();
		System.out.println("\n\nBeneficio con Algoritmo Simple: " + cs.calcula(ventas) + " US$");
		
		//	ALGORITMO COMPLEJO
		CalculadoraCompleja cc = new CalculadoraCompleja();
		System.out.println("Beneficio con Algoritmo Simple: " + cc.calcula(ventas) + " US$");
		
	}

}
