//jean carlos canova gondorek
import java.util.Scanner;
import java.util.ArrayList;
public class Frota {

	public ArrayList <String> marca = new ArrayList<String>();

	public ArrayList <String> modelo = new ArrayList<String>();

	public ArrayList <String> placa = new ArrayList<String>();

	public ArrayList <Double> quilometragem = new ArrayList<Double>();

	public void cadastrarfrota() {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		String marc1;
		String model1;
		String plac1;
		double quilometrage1;
		System.out.println("Digite a marca do carro.");
		marc1 = scan.nextLine();
		System.out.println("Digite o modelo do carro.");
		model1 = scan.nextLine();
		System.out.println("Digite a placa do carro.");
		plac1 = scan.nextLine();
		System.out.println("Digite a quilometragem inicial do carro.");
		quilometrage1 = scan.nextDouble();
		modelo.add(model1);
		placa.add(plac1);
		quilometragem.add(quilometrage1);
		marca.add(marc1);
		System.out.println("\n\n\n");
	}

	public void listarveiculos() {
		int inteiro = quilometragem.size();
		for (int i=0; i < inteiro; i++){
			System.out.print("Marca: " + marca.get(i));
			System.out.print("\tModelo " + modelo.get(i));
			System.out.println("\tPlaca: " + placa.get(i));
			System.out.println("\tQuilometragem: " + quilometragem.get(i) + "\n\n");
		}
		System.out.println("\n\n\n");
	}

}
