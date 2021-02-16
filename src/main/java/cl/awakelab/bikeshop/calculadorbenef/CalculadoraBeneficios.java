package cl.awakelab.bikeshop.calculadorbenef;

import java.util.List;
/**
 * 
 * @author cLatorre
 * Interface para realizar el cálculo de los beneficios
 *
 */
public interface CalculadoraBeneficios {
	/**
	 * Función para calcular los distintos beneficios
	 * @param lista de valores
	 * @return un monto entero (int) 
	 */
	public Integer calcula(List<Integer> list);
}
