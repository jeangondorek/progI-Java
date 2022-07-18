/*jean carlos canova gondorek*/
import java.util.Scanner;
class progmen {
  public static void main(String [] args) {
    Scanner scanner = new Scanner (System.in);
    Classes operacao = new Classes();
    double monant=0;
    int opt=0;

    System.out.println("Digite o valor total da compra: ");
    operacao.valortotal = scanner.nextDouble();
    operacao.sobravalor = operacao.valortotal;
    System.out.println("Digite a quantidade de parcelas: ");
    operacao.nparcelas = scanner.nextInt();
    System.out.println("Digite o valor de entrada / caso não houver digite 0: ");
    operacao.entrada = scanner.nextDouble();

    while(opt!=4){
      System.out.println("\n\n\n\n\n\n\n");
      System.out.println("Para calcular um parcelamento digite 1.");
      System.out.println("Para antecipar prestação digite 2.");
      System.out.println("Para pagamentos com atraso digite 3.");
      System.out.println("Para sair digite 4.");
      opt = scanner.nextInt();
      switch (opt) {
        case 1:{
          System.out.println("\n\n\n\n\n\n\n");
          operacao.valorprest();
          break;
        }
        case 2:{
          System.out.println("\n\n\n\n\n\n\n");
          System.out.println("Digite o valor de antecipação das parcelas: ");
          monant = scanner.nextDouble();
          operacao.antecip(monant);
          break;
          }
          case 3:{
            System.out.println("\n\n\n\n\n\n\n");
            operacao.valoratraso();
            break;
          }
        case 4:{
          System.out.println("\n\n\nInformações da compra atualizadas: ");
          System.out.println("Valor restante: " + operacao.sobravalor + "R$");
          break;
        }
        default:
          System.out.println("\n\n\nERRO!!! \n\n\n");
          break;
        }
    }
  }
}
