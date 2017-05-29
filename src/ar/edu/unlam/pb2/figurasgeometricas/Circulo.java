package ar.edu.unlam.pb2.figurasgeometricas;

public class Circulo extends Figura{
	
	private Double radio;
	
	//CONSTRUCTORES
	public Circulo (Double radio)
	{
		this.radio = radio;
	}
	
	public Circulo ()
	{
		radio = 0d;
	}
	
	
	//GETTERS Y SETTER
	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}
		
	
	//HASH Y EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((radio == null) ? 0 : radio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (radio == null) {
			if (other.radio != null)
				return false;
		} else if (!radio.equals(other.radio))
			return false;
		return true;
	}
	
	
	// METODOS - Se heredan y sobreescriben los abstractos de la clase padre
	@Override
	public Double calcularArea() {
		Double area;
		area = Math.PI*(radio*radio);
		return area;
	}

	@Override
	public Double calcularPerimetro() {
		Double perimetro;
		perimetro = 2 * Math.PI*radio;
		return perimetro;
	}

	@Override
	public void dibujarFigura()
	{
		System.out.println("Se dibuja un circulo");
	}

}
