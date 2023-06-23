package calcu;

public class Main {

	public static void main(String[] args) {
	
		calculadora micalculadora = new calculadora(17,5);
		
		float suma = micalculadora.sumar();
		System.out.println("El resultado de la suma es " + suma);
		
		
		float resta = micalculadora.restar();
		System.out.println("El resultado de la resta es " + resta);
		
		float dividir = micalculadora.dividir();
		System.out.println("El resultado de la division es " + dividir);
	}
	
	
	}

