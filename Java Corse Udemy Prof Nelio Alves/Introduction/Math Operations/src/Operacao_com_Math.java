import java.util.Locale;

public class Operacao_com_Math {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
//		Algumas fun��es matem�ticas em Java
//		Exemplo Significado

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x);   // Vari�vel A recebe a raiz quadrada de x;
		A = Math.pow(x, y); // Vari�vel A recebe o resultado de x elevado a y
		A = Math.abs(x);    // Vari�vel A recebe o valor absoluto de x;
		
		double valor = Math.pow(1.02, 3);
		double diferenteValor = 1.02 * 1.02 * 1.02;
		double total = 200.00 * valor;
		
		System.out.println("Total valor: " + String.format("%.2f",valor));
		System.out.println("Total diferente valor: " + String.format("%.2f",diferenteValor));
		System.out.println("Total : " + String.format("%.2f",total));

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);

		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);

		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		A = Math.abs(y);
		B = Math.abs(z);

		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

		// Calculo de porcentagens
		double anualPayment = 50000.00;
		double helth        = 2000.00;
		double tax;

//		double total = anualPayment * (25.0 / 100);
		System.out.println(total);
				
		if (helth != 0) {
			total = total - (helth * (50.0 / 100));
		}
		System.out.println("Total: " + total);

	}

}
