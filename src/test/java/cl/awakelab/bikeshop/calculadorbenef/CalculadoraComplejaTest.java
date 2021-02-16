package cl.awakelab.bikeshop.calculadorbenef;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraComplejaTest {
	
	CalculadoraCompleja cc = new CalculadoraCompleja();
	
	List<Integer> ventasNormal = new ArrayList<Integer>();
	List<Integer> ventasBorde = new ArrayList<Integer>();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@Test
	void casoNormalTest() {
		
		//	Valores Normales
		ventasNormal.add(136);
		ventasNormal.add(460);
		ventasNormal.add(395);
		ventasNormal.add(122);
		ventasNormal.add(441);
		ventasNormal.add(256);
		ventasNormal.add(1690);
		ventasNormal.add(699);
		ventasNormal.add(525);
		ventasNormal.add(654);
		
		int esperado = 240;
		int resultado = cc.calcula(ventasNormal);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void casoBordesTest() {
		
		//	Valores Borde
		ventasBorde.add(1001);
		ventasBorde.add(1000);
		ventasBorde.add(999);
		ventasBorde.add(501);
		ventasBorde.add(500);
		ventasBorde.add(499);
		ventasBorde.add(0);
		
		int esperado = 110;
		int resultado = cc.calcula(ventasBorde);
		assertEquals(esperado, resultado);
	}

}
