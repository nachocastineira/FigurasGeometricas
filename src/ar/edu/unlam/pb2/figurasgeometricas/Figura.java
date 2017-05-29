package ar.edu.unlam.pb2.figurasgeometricas;

public abstract class Figura { //declaro la clase como abstracta
	
	private String color;
	

	public Figura(){
	this.color = "Negro";
}
	
	//GETTERS Y SETTERS
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
		
	//CLASES ABSTRACTAS: Lo veremos en desarrollo mas adelante
	public abstract  Double calcularArea();
	public abstract  Double calcularPerimetro();
	public abstract void dibujarFigura();
	

}
