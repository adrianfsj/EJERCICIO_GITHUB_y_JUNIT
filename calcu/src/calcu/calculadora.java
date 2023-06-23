package calcu;

public class calculadora {
	
	float num1;
	float num2;
	
	
	public calculadora(float num1, float num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	
	
	public float sumar() {
		return num1+num2;
	}
	
	public float restar() {
		return num1-num2;
	}
	
	public float multiplicar() {
		return num1*num2;
	}
	
	public float dividir() {
		return num1/num2;
	}

}

