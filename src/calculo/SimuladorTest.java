package calculo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SimuladorTest {
	
	private Simulador simulador;
	
	@Before 
	public void setUp(){
		this.simulador = new Simulador();
	}

	@Test
	public void teste1() {
		
		double res = Simulador.calcularIPTU("1", 95450.00, 0);
		double valorEsperado =  572.70;
		assertEquals(valorEsperado, res, 0);  
	
		
	}
	@Test
	public void teste2() {
		
		double res = Simulador.calcularIPTU("3", 47724.00, 0);
		double valorEsperado = 477.24;
		assertEquals(valorEsperado, res, 0);  
	
		
	}
	
	@Test
	public void teste3() {
		
		double res = Simulador.calcularIPTU("3", -47724.00, 0);
		double valorEsperado =  -477.24;
		assertEquals(valorEsperado, res, 0);  
	
		
	}
	@Test
	public void teste4() {
		
		double res = Simulador.calcularIPTU("1", -95450.00, 0);
		double valorEsperado =  -572.70;
		assertEquals(valorEsperado, res, 0);  
	
		
	}
	@Test
	public void teste5() {
		
		double res = Simulador.calcularIPTU("2", 35793.00, 0);
		double valorEsperado =  429.516;
		assertEquals(valorEsperado, res, 0.1);  
	
		
	}

	

	

}
