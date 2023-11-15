package calculadora.Dominio;

public class Calculadora {

	private int num1;
	private int num2;

	public Calculadora(){
		this.num1 = 1;
		this.num2 = 2;
	}
	public Calculadora(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	@Override
	public String toString(){
		return "Calculadora{" +
				"numero 1 =" + num1 +
				"numero 2 =" + num2 +
				"}";
	}

	public int sumar() {
		return sumar();
	}

	private int sumador() {
		return this.num1 + this.num2;
	}

}