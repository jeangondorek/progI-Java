//*Jean Carlos Canova Gondorek*//
import java.util.Scanner;
class CamaroteInferior extends IngressoVip{
  Scanner scanner = new Scanner (System.in);
  double viradicional = 200;
  String local;
  double descontoconsumo;
  double totalconsumo;

  void mostravalvami(){
    System.out.println("Valor do camarote: " + viradicional + " R$");
  }
  void mostrarlocal(){
    System.out.println("Digite o local do camarote: ");
    local = scanner.next();

    System.out.println("Local do camarote: " + local);
  }
  void mostrarconsumo(){
    System.out.println("Digite o consumo total.");
    totalconsumo = scanner.nextDouble();
    System.out.println("Consumo total: " + totalconsumo);
    descontoconsumo = totalconsumo*0.05;
    totalconsumo = totalconsumo - descontoconsumo;
    System.out.println("Desconto do consumo:" + descontoconsumo);
    System.out.println("Consumo com desconto: " + totalconsumo);

  }

}
