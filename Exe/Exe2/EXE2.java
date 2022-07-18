//*Jean Carlos Canova Gondorek*//
import java.util.Scanner;
class EXE2{
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);

    Ingresso ingresso = new Ingresso();
    IngressoNormal ingressonormal = new IngressoNormal();
    IngressoVip ingressovip = new IngressoVip();
    CamaroteInferior caminf = new CamaroteInferior();
    CamaroteSuperior camsup = new CamaroteSuperior();

    int opt=0;

    while(opt!=3){
      System.out.println("\n\n\n\n\n\n\n\n");
      System.out.println("1 - PARA INGRESSO NORMAL.");
      System.out.println("2 - PARA INGRESSO VIP.");
      System.out.println("3 - PARA SAIR.");
      System.out.println("Digite a opção desejada:");
      opt = scanner.nextInt();
      switch (opt){
        case 1:{
          ingresso.mostrarvalor();
          System.out.println("PARA COMPRAR O INGRESSO NORMAL DIGITE 3, PARA VOLTAR 1.");
          opt = scanner.nextInt();
          System.out.println("\n\n\n\n\n\n\n\n");
          if(opt==3){
            System.out.println("\n\n\n\n\n\n\n\n");
            ingressonormal.calculavalor();
            ingressonormal.mostravalor();
          }
          break;
        }

        case 2:{
          ingressovip.valoringressovip();
          int supinf;
          System.out.println("PARA COMPRAR O INGRESSO VIP DIGITE 3, PARA VOLTAR 1.");
          opt = scanner.nextInt();
          System.out.println("\n\n\n\n\n\n\n\n");
          if(opt==3){
            System.out.println("\n\n\n\n\n\n\n\n");
            ingressovip.calculavalorV();
            ingressovip.mostravalorV();
            System.out.println("Digite 1 para camarote superior e 2 para camarote inferior.");
            supinf = scanner.nextInt();
            if(supinf==1){
                camsup.mostravalvams();
                  System.out.println("Camarote e ingressos: "+(ingressovip.total+camsup.adicional)+" R$");
            }
            else if(supinf==2){
                caminf.mostravalvami();
                System.out.println("Camarote e ingressos: "+(ingressovip.total+caminf.viradicional)+" R$");
                caminf.mostrarlocal();
                caminf.mostrarconsumo();
            }

          }

          break;
        }
        case 3:{
          System.out.println("SAINDO.");
          break;
        }
        default:{
          System.out.println(" Erro nenhuma opção escolhida.");
          System.out.println("\n\n\n\n\n\n\n\n");
          break;

        }
    }

  }
}
}
