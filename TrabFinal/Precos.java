//jean carlos canova gondorek
import java.util.Scanner;
import java.util.ArrayList;
public class Precos {

	public double valordiaria ;

	public double taxaquilometro;

	public double valorcombustivel;

	public void cadastrarprecos() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da diaria:");
		valordiaria = scan.nextDouble();
		System.out.println("Digite o valor da taxa por quilometro: ");
		taxaquilometro = scan.nextDouble();
		System.out.println("Digite o valor do combustivel: ");
		valorcombustivel = scan.nextDouble();
		System.out.println("\n\n\n");
	}
	public void listarvalores() {
		System.out.println("Valor da diaria: " + valordiaria);
		System.out.println("Valor da taxa por quilometro: " + taxaquilometro);
		System.out.println("Valor do litro de combustivel: " + valorcombustivel + "\n\n");
		System.out.println("\n\n\n");
	}
}
