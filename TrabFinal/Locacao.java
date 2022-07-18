//jean carlos canova gondorek
import java.util.Scanner;
import java.util.ArrayList;
public class Locacao{
	Scanner scan = new Scanner(System.in);
	Clientes clien = new Clientes();
	Frota carr = new Frota();
	Precos prec = new Precos();

	double valortotal;

	double kmspagar;

	double dias;

	double litrosapagar;

	public ArrayList<Integer> idclientelocador = new ArrayList<Integer>();

	public ArrayList<String> placaveiculolocado = new ArrayList<String>();

	public ArrayList<Double> kmsdocarro = new ArrayList<Double>();

	public void cadastrarlocacao() {
		int idd=1;
		String placaca;
		double kms;
		System.out.println("Digite o ID do cliente:");
		idd = scan.nextInt();
		idclientelocador.add(idd);
		System.out.println("Placa do carro:");
		placaca = scan.next();
		placaveiculolocado.add(placaca);
		System.out.println("Digite os kms rodados:");
		kms = scan.nextDouble();
		kmsdocarro.add(kms);
		System.out.println("\n\n\n");
	}

	public void listarlocacoes() {
		int inteiro = idclientelocador.size();
		for (int i=0; i < inteiro; i++){
			System.out.print("ID do locador: " + idclientelocador.get(i));
			System.out.print("\tPlaca do carro locado: " + placaveiculolocado.get(i));
			System.out.println("\tQuilometros iniciais do carro: " + kmsdocarro.get(i) + "\n\n");
		}
		System.out.println("\n\n\n");
	}

	public void Calculartotaldiarias(double vldd) {
		System.out.println("Digite a quantidade de dias locados.");
		dias = scan.nextInt();
		dias = vldd * dias;
		System.out.println("Total das diarias:" + dias);
		System.out.println("\n\n\n");
	}

	public void Calcularquilometragem(double tata ) {
		double kmsatual;
		int i;
		System.out.println("Digite a ID do cliente para calculo.");
		i = scan.nextInt();
		System.out.println("Digite a quilometragem atual do carro.");
		kmsatual = scan.nextDouble();
		i=i-1;
		kmspagar = kmsatual - kmsdocarro.get(i);
		System.out.println("Quilometragem rodada, calcular taxa = " + kmspagar + "km");
		kmspagar = kmspagar * tata;
		System.out.println("Pagar: " + kmspagar + "R$");
		System.out.println("\n\n\n");
	}

	public void Calcularreposicaocombustivel(double vlpc) {
		System.out.println("Digite os litros a pagar.");
		litrosapagar = scan.nextDouble();
		litrosapagar = litrosapagar * vlpc;
		System.out.println("R$ pagos pelos litros: " + litrosapagar);
		System.out.println("\n\n\n");
	}

	public void Calcvalortotal() {
		valortotal = dias + litrosapagar + kmspagar;
		System.out.println("Total a pagar" + valortotal + "\n\n\n");
	}

	public void extrato() {
		System.out.println("Diarias: " + dias);
		System.out.println("Valor da taxa por quilometros: " + kmspagar);
		System.out.println("Valor reposicao de combustivel: " + litrosapagar);
		System.out.println("Valor total: " + valortotal + "\n\n\n");

	}

	public static void main(String[] args){
		Precos precos = new Precos();
		Clientes clientes = new Clientes();
		Frota frota = new Frota();
		Locacao loc = new Locacao();
		int opt=-1;
		while(opt!=0){
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite a opcao desejada:");
			System.out.println("1  - para cadastrar clientes");
			System.out.println("2  - para cadastrar frota");
			System.out.println("3  - para cadastarar precos");
			System.out.println("4  - para listar clientes");
			System.out.println("5  - para listar frota");
			System.out.println("6  - para listar precos");
			System.out.println("7  - para cadastrar locacao");
			System.out.println("8  - para listar locacoes");
			System.out.println("9  - para calcular total de diarias");
			System.out.println("10 - para calcular valor quilometragem");
			System.out.println("11 - para calcular reposicao combustivel");
			System.out.println("12 - para calcular valor total");
			System.out.println("13 - para ver extrato");
			System.out.println("0  - para sair");
			System.out.println("\n\n");
			opt = scan.nextInt();
			switch(opt){
				case 1:{
					clientes.cadastrarclientes();
					break;
				}
				case 2:{
					frota.cadastrarfrota();
					break;
				}
				case 3:{
					precos.cadastrarprecos();
					break;
				}
				case 4:{
					clientes.listarclientes();
					break;
				}
				case 5:{
					frota.listarveiculos();
					break;
				}
				case 6:{
					precos.listarvalores();
					break;
				}
				case 7:{
					loc.cadastrarlocacao();
					break;
				}

				case 8:{
					loc.listarlocacoes();
					break;
				}

				case 9:{
					double valordiariad = precos.valordiaria;
					loc.Calculartotaldiarias(valordiariad);
					break;
				}

				case 10:{
					double taxaquilometroq = precos.taxaquilometro;
					loc.Calcularquilometragem(taxaquilometroq);
					break;
				}

				case 11:{
					double valorcombustivelc = precos.valorcombustivel;
					loc.Calcularreposicaocombustivel(valorcombustivelc);
					break;
				}

				case 12:{
					loc.Calcvalortotal();
					break;
				}
				case 13:{
					loc.extrato();
					break;
				}
				case 0:{
					System.out.println("SAINDO.....");
					System.out.println("\n\n\n");
					break;
				}
				default:
					System.out.println("ERRO");
					System.out.println("\n\n\n");
					break;
			}
		}
	}
}
	