//*Jean Carlos Canova Gondorek*//
import java.util.Scanner;
class EXE1{
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    int tpc = 0; //*PARA VER CONTA ESPECIAL E COMUM*//
    ContaComum1 contacomum = new ContaComum1(); //*CLASSE CONTA COMUM*//
    ContaEspecial1 contaespecial = new ContaEspecial1();//*CLASSE CONTA ESPECIAL*//
    double jsobreconta= 0; //*VALOR DO JUROS LIMITE ESPECIAL*//

    while(tpc!=1 || tpc!=2){
      System.out.println("Digite o Tipo de Conta ('1' para especial e '2' para comum): ");
      tpc = scanner.nextInt();
      if(tpc!=1 || tpc!=2){
        System.out.println("Tipo de conta não existe.");
      }
      if (tpc==1){
        //*LER CONTA ESPECIAL*//
        contaespecial.lerespecial();
        break;
      }
      else if(tpc==2){
        //*LER CONTA COMUM*//
        contacomum.lercomum();
        break;
      }
    }

    int opt = 0;
    while(opt!=6){
      //*MENU*//
      System.out.println("\n\n\n\n\n\n\n");
      System.out.println("Para consultar saldo 1.");
      System.out.println("Para sacar 2.");
      System.out.println("Para depositar 3.");
      System.out.println("Para calcular juros de limite conta especial 4.");
      System.out.println("Para ver juros de limite conta especial 5.");
      System.out.println("Para sair digite 6.");
      opt = scanner.nextInt();
      switch(opt){
        case 1:{
          //*MOSTRA VALORES*//
          if (tpc==1){
            //*CONTA ESPECIAL*//
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("Numero da conta. " + contaespecial.numero +"-"+ tpc);//*INCLUI O TIPO DE CONTA USANDO -1 PARA ESPECIAL E -2 PARA COMUM*//
            System.out.println("Saldo na conta. " + contaespecial.saldo);
            System.out.println("Limite especial da conta. " + contaespecial.limite);
            System.out.println("Juros do limite especil da conta (em %). " + (contaespecial.juros*100));
          }
          else{
            //*CONTA COMUM*//
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("Numero da conta. " + contacomum.numero +"-"+ tpc);//*INCLUI O TIPO DE CONTA USANDO -1 PARA ESPECIAL E -2 PARA COMUM*//
            System.out.println("Saldo na conta. " + contacomum.saldo);
          }
          break;
        }
        case 2:{
          //*SAQUES*//
          if (tpc ==1){
            contaespecial.saqueespecial();
          }
          else{
            contacomum.saquecomum();
          }
          break;
        }
        case 3:{
          //*DEPOSITOS*//
          if (tpc ==1){
            contaespecial.depositoespecial();
          }
          else{
            contacomum.depositocomum();
          }
          break;
        }
        case 4:{
          //*CALCULAR JUROS*//
          if (tpc ==1){
            jsobreconta=contaespecial.JurosConta(jsobreconta);
          }
          else{
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("Conta não tem limite especial.");
          }

          break;
        }
        case 5:{
          //*JUROS SOBRE O LIMITE ESPECIAL*//
          if (tpc ==1){
              if (jsobreconta<0){
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("Juros sobre o limite= " + jsobreconta + "R$");
              }
              else{
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("Conta não entrou no limite especial.");
              }
          break;
          }
          else{
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("Conta não tem limite especial.");
            break;
          }
        }
        case 6:{
          //*SAIR DO PROGRAMA*//
          System.out.println("\n\n\n\n\n\n\n");
          System.out.println("Saindo. ");
          break;
        }
        default:
          //*PADRÃO PARA ERROS*//
          System.out.println("\n\n\n\n\n\n\n");
          System.out.println("ERRO. ");
          break;
      }
  }
}
}
