package ar.edu.unlam.pb2.figurasgeometricas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFigura {
	
	public void dibujarUnaFigura (Figura figuraADibujar) //recibe como parametro un objeto figura
	{
		figuraADibujar.dibujarFigura();
		
		if (figuraADibujar instanceof Triangulo)
		{
			System.out.println("LADO A="+((Triangulo)figuraADibujar).getLado1());
		}
	}

	@Test
	public void dibujarUnCirculo() {
		Circulo circuloNuevo = new Circulo(10.0); //luego del new instancio la clase y se asigna un lugar de memoria
		dibujarUnaFigura(circuloNuevo); //el nuevo circulo es una figura
		assertEquals(new Double (314.16), circuloNuevo.calcularArea(), 0.01); //comparo valores		
	}
	
	@Test
	public void dibujarUnTriangulo(){
		Triangulo trianguloNuevo = new Triangulo(8d, 9d, 10d, 90, 120, 70);
		dibujarUnaFigura(trianguloNuevo);  // de nuevo casteo, el triangulo es una figura
		assertEquals(new Double (27.0), trianguloNuevo.calcularPerimetro(), 0.01);
	}
	
	@Test
	public void dibujarUnaFigura(){
		Figura figura = new Circulo(10d);
		
	}

}
