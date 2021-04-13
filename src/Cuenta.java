

public class Cuenta {
	private String titular;
	private double saldo;
	
	public Cuenta(String titular) {
		this.titular=titular;
		this.saldo=0.0;
	}
	
	public Cuenta(String titular, double saldoInicial) {
		this.titular=titular;
		this.saldo=saldoInicial;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setTitular(String titular) {
		this.titular=titular;
	}
	
	public String toString() {
		return "Titular:" + this.titular + " Saldo: " + this.saldo;
	}
	
	public void depositar(double cantidad) {
		if(cantidad>=0.0) {
			this.saldo+=cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		if (this.saldo<cantidad  && this.saldo>0) {
			System.out.println("Insuficiente - Ingrese un importe igual o menor a " + this.saldo + "(Saldo Actual)");
		}
		else 
			this.saldo-=cantidad;
			System.out.println("El saldo en cuenta es " + this.saldo);
			
		if (this.saldo<0) {
			System.out.println("Imposible retirar");
		}
	}
	
		

	
	
}
