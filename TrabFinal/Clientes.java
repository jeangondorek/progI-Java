//jean carlos canova gondorek
import java.util.Scanner;
import java.util.ArrayList;
public class Clientes {

	int i1 = 1;

	public ArrayList <Integer> id = new ArrayList <Integer>();

	public ArrayList <String> nome = new ArrayList <String>();

	public ArrayList <Integer> numerocnh = new ArrayList <Integer>();

	public void cadastrarclientes() {
		Scanner scan = new Scanner(System.in);
		String nom1;
		int i = 0;
		int numerocn1;
		System.out.println("Digite o nome do cliente.");
		nom1 = scan.nextLine();
		System.out.println("Digite o numero da CNH.");
		numerocn1 = scan.nextInt();
		System.out.println("ID do cliente = " + i1);
		nome.add(nom1);
		id.add(i1);
		numerocnh.add(numerocn1);
		System.out.println("\n\n\n");
		i1++;
	}
	public void listarclientes() {
		int inteiro = id.size();
		for (int i=0; i < inteiro; i++){
			System.out.print("Nome: " + nome.get(i));
			System.out.print("\tNumero da cnh: " + numerocnh.get(i));
			System.out.println("\tID: " + id.get(i) + "\n\n");
		}
		System.out.println("\n\n\n");
	}
}
