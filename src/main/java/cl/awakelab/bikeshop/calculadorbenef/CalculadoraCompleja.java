package cl.awakelab.bikeshop.calculadorbenef;

import java.util.List;

public class CalculadoraCompleja implements CalculadoraBeneficios {

	@Override
	public Integer calcula(List<Integer> list) {
		Integer totalVenta = 0;
		double totalBeneficio = 0;
		
		for (Integer venta : list) {
			//	Sumatoria de la venta
			totalVenta += venta;
			
			//	Opciones de beneficios según venta mensual
			if (venta > 1000) {
				totalBeneficio += venta * 0.05;
			} else if(venta > 500) {
				totalBeneficio += venta * 0.02;
			}else {
				totalBeneficio += venta * 0.01;
			}
		}
		
		//	Si la venta total es sobre 5000 agrega 100 US$
		if(totalVenta > 5000) {
			totalBeneficio += 100;
		}
		
		return (int) Math.round(totalBeneficio);
	}

}
