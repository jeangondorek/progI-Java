//*Jean Carlos Canova Gondorek*//
import java.util.Scanner;
class ContaEspecial1 extends ContaComum1{
  float limite;
  float juros;

void lerespecial(){
  //*LEITURA CONTA ESPECIAL*//
  System.out.println("\n\n\n\n\n\n\n");
  Scanner scanner = new Scanner (System.in);
  System.out.println("Digite o número da conta: ");
  numero = scanner.nextInt();
  System.out.println("Digite o saldo da conta: ");
  saldo = scanner.nextFloat();
  System.out.println("Digite o limite da conta: ");
  limite = scanner.nextFloat();
  System.out.println("Digite o juros da conta: ");
  juros = scanner.nextFloat();
  juros = juros / 100;
}

void saldoespecial(){
  //*SALDO COM LIMITE ESPECIAL*//
  System.out.println("\n\n\n\n\n\n\n");
  System.out.println("Saldo da conta é: " + saldo);
  System.out.println("Saldo do limite especial é: " + limite);
}

void saqueespecial(){
  //*SAQUE DA CONTA ESPECIAL*//
  Scanner scanner = new Scanner (System.in);
  float valorsaque;
  System.out.println("\n\n\n\n\n\n\n");
  System.out.println("Valor do saque. ");
  valorsaque = scanner.nextFloat();
  if (valorsaque <= (saldo + limite)){
    saldo = saldo - valorsaque;
  }
  else{
    System.out.println("\n\n\n\n\n\n\n");
    System.out.println("ERRO, saque maior que saldo e limite especial.");
  }
}
void depositoespecial(){
  //*DEPOSITO*//
  Scanner scanner = new Scanner (System.in);
  System.out.println("\n\n\n\n\n\n\n");
  System.out.println("Digite valor do deposito.");
  float deposito = scanner.nextFloat();
  saldo = saldo + deposito;
}

double  JurosConta(double jsobreconta){
  //*SALDO NEGATIVA = JUROS DIGITADO*//
  if(saldo<0){
    System.out.println("\n\n\n\n\n\n\n");
    jsobreconta = saldo * juros;
    System.out.println("Juros de "+ (juros*100) +" sobre o limite especial. ");
  }
  return jsobreconta;
}

}
