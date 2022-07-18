//*Jean Carlos Canova Gondorek*//
import java.util.Scanner;
class IngressoVip extends Ingresso{
  double adicional = 20;
  double total;
  double valoringressov;
  double desconto;

  void valoringressovip(){
    Ingresso ingresso = new Ingresso();
    valoringressov = ingresso.valoringresso + adicional;
    System.out.println("Valor ingresso VIP: " + valoringressov + "R$");
  }
  void calculavalorV(){
    Scanner scanner = new Scanner (System.in);
    int quantidade;
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
    total = valoringressov*quantidade;
    total = total - (total*desconto);
  }

  void mostravalorV(){
    System.out.println("Valor total dos ingressos: " + total + " R$");

  }
}
