import java.util.Scanner;

public class Calculadora {
	public static void main (String[] args) {
	Scanner teclado= new Scanner (System.in);
	System.out.println("Bienvenidos al Cajero Automatico");
	System.out.println("--------------------");
	int opcion= 0;
	
	
	System.out.println("Crear Cuenta");
	System.out.println("Ingrese el nombre>>");
	String titular= teclado.next();
	System.out.println("Ingrese el saldo inicial>>");
	double saldoInicial= teclado.nextDouble();
	Cuenta cuenta= new Cuenta(titular, saldoInicial);
	System.out.println("Se creó la cuenta con saldo "+ cuenta.getSaldo() );
	System.out.println("--------------------");
	
	do {
		System.out.println("Ingrese una opcion>>");
		System.out.println("1 Consultar Cuenta");
		System.out.println("2 Depositar");
		System.out.println("3 Retirar");
		System.out.println("0 Salir");
		
		opcion= teclado.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Informacion de cuenta");
			System.out.println("Titular: " + cuenta.getTitular() + " - " + "Saldo: " + cuenta.getSaldo());
			System.out.println("--------------------");
			break;
			
		case 2:
			System.out.println("Ingrese Monto a Depositar>>");
			double montoADepositar= teclado.nextDouble();
			cuenta.depositar(montoADepositar);
			System.out.println("--------------------");
			break;
			
		case 3:
			System.out.println("Ingrese Monto a Retirar>>");
			double montoARetirar= teclado.nextDouble();
			cuenta.retirar(montoARetirar);
			System.out.println("--------------------");
			break;
			
		case 0:
			System.out.println("Saliendo..");
			break;
		}
	}while(opcion!=0);
	
	
}
}