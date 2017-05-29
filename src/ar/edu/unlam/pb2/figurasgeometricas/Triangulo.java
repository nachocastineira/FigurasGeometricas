package ar.edu.unlam.pb2.figurasgeometricas;

public class Triangulo extends Figura{
	
	private Double lado1;
	private Double lado2;
	private Double lado3;
	private Integer anguloA;
	private Integer anguloB;
	private Integer anguloC;
	
	public Triangulo(Double lado1, Double lado2, Double lado3, Integer anguloA, Integer anguloB ,Integer anguloC  )
	{
		this.anguloA = anguloA;
		this.anguloB = anguloB;
		this.anguloC = anguloC;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;		
	}
	
	
	//getters y setters
	public Double getLado1() {
		return lado1;
	}

	public void setLado1(Double lado1) {
		this.lado1 = lado1;
	}

	public Double getLado2() {
		return lado2;
	}

	public void setLado2(Double lado2) {
		this.lado2 = lado2;
	}

	public Double getLado3() {
		return lado3;
	}

	public void setLado3(Double lado3) {
		this.lado3 = lado3;
	}

	public Integer getAnguloA() {
		return anguloA;
	}

	public void setAnguloA(Integer anguloA) {
		this.anguloA = anguloA;
	}

	public Integer getAnguloB() {
		return anguloB;
	}

	public void setAnguloB(Integer anguloB) {
		this.anguloB = anguloB;
	}

	public Integer getAnguloC() {
		return anguloC;
	}

	public void setAnguloC(Integer anguloC) {
		this.anguloC = anguloC;
	}

	
	//EQUALS Y HASHCODE
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anguloA == null) ? 0 : anguloA.hashCode());
		result = prime * result + ((anguloB == null) ? 0 : anguloB.hashCode());
		result = prime * result + ((anguloC == null) ? 0 : anguloC.hashCode());
		result = prime * result + ((lado1 == null) ? 0 : lado1.hashCode());
		result = prime * result + ((lado2 == null) ? 0 : lado2.hashCode());
		result = prime * result + ((lado3 == null) ? 0 : lado3.hashCode());
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
		Triangulo other = (Triangulo) obj;
		if (anguloA == null) {
			if (other.anguloA != null)
				return false;
		} else if (!anguloA.equals(other.anguloA))
			return false;
		if (anguloB == null) {
			if (other.anguloB != null)
				return false;
		} else if (!anguloB.equals(other.anguloB))
			return false;
		if (anguloC == null) {
			if (other.anguloC != null)
				return false;
		} else if (!anguloC.equals(other.anguloC))
			return false;
		if (lado1 == null) {
			if (other.lado1 != null)
				return false;
		} else if (!lado1.equals(other.lado1))
			return false;
		if (lado2 == null) {
			if (other.lado2 != null)
				return false;
		} else if (!lado2.equals(other.lado2))
			return false;
		if (lado3 == null) {
			if (other.lado3 != null)
				return false;
		} else if (!lado3.equals(other.lado3))
			return false;
		return true;
	}

		
	//	METODO DE AREA, copiado del profe
	private Double calcularAlturaA()
	{
	return (calcularT()/lado1);
	}
		

	private Double calcularT(){
		return (0.5*Math.sqrt((lado1+lado2+lado3)*(lado1-lado2-lado3)*(lado1+lado2+lado3)*(lado1+lado2+lado3)));
	}
	
	@Override
	public Double calcularArea() {
		Double base = lado1;
		double altura = calcularAlturaA();
		Double area = ((base*altura)/2);
		return area;
	}
	
	
//	@Override
//	public Double calcularArea() {
//		Double area;
//		Double sp = 2/(lado1 + lado2 + lado3);  //semiperimetro
//		area = Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3));
//		return area;
//	}

	//METODO DE PERIMETRO
	@Override
	public Double calcularPerimetro() {
		Double perimetro;
		perimetro = (this.lado1 + this.lado2 + this.lado3);
		return perimetro;
	}

	@Override
	public void dibujarFigura() {
		System.out.println("Se dibuja un triangulo");
		
	}
		

}
