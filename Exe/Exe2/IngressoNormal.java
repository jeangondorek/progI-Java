//*Jean Carlos Canova Gondorek*//
import java.util.Scanner;
class IngressoNormal extends Ingresso{
  int quantidade;
  double desconto;
  double total;

void calculavalor(){
  Scanner scanner = new Scanner (System.in);
  Ingresso ingresso = new Ingresso();
  System.out.println("Digite a quantidade de ingressos. ");
  quantidade = scanner.nextInt();
  if(quantidade>4 && quantidade<11){
    desconto = 0.05;
  }
  else if(quantidade>10 && quantidade<16){
    desconto = 0.10;
  }
  else if(quantidade>15){
    desconto = 0.15;

  }
  total = valoringresso*quantidade;
  total = total - (total*desconto);
}

void mostravalor(){
  System.out.println("Valor total: " + total + " R$");

}
}
