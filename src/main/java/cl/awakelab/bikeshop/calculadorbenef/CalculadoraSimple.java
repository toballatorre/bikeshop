package cl.awakelab.bikeshop.calculadorbenef;

import java.util.List;

public class CalculadoraSimple implements CalculadoraBeneficios {

	@Override
	public Integer calcula(List<Integer> list) {
		// inicializar el total
		int totalVenta = 0;
		
		for (Integer venta : list) {
			totalVenta += venta;
		}
		
		return (int) Math.round(totalVenta * 0.03);
	}

}
