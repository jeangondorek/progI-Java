//Jean Carlos Canova Gondorek//
import java.util.Scanner;
class ContaComum1{
  int numero;
  float saldo;

void lercomum(){
  //*LÊ AS INFORMAÇÕES DA CONTA*//
  System.out.println("\n\n\n\n\n\n\n");
  Scanner scanner = new Scanner (System.in);
  System.out.println("Digite o número da conta: ");
  numero = scanner.nextInt();
  System.out.println("Digite o saldo da conta: ");
  saldo = scanner.nextFloat();
}

void saquecomum(){
  /*SAQUE CONTA COMUM*/
  Scanner scanner = new Scanner (System.in);
  float valorsaque;
  System.out.println("\n\n\n\n\n\n\n");
  System.out.println("Valor do saque. ");
  valorsaque = scanner.nextFloat();
  if (valorsaque <= saldo){
    saldo = saldo - valorsaque;
  }
  else{
    System.out.println("\n\n\n\n\n\n\n");
    System.out.println("Erro, saque maior que saldo.");
  }
}

void depositocomum(){
  //*DEPOSTIO*//
  System.out.println("\n\n\n\n\n\n\n");
  Scanner scanner = new Scanner (System.in);
  System.out.println("Digite valor do deposito.");
  float deposito = scanner.nextFloat();
  saldo = saldo + deposito;
}


}
