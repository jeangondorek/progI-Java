import java.util.Scanner;
class vet {
  public static void main(String [] args) {
    Scanner scanner = new Scanner (System.in);
    int[] vetor1;
    int[] vetor2;
    int[] bar;
    bar= new int[1];
    vetor1 = new int[5];
    vetor2 = new int[5];
    for (int b=0;b<5;b++){
      System.out.println("Digite o valor " + b + " do vetor 1 : " );
      vetor1[b] = scanner.nextInt();
      if (vetor1[b]==0){
        bar[0]=0;
      }
    }
    for (int a=0;a<5;a++){
      System.out.println("Digite o valor " + a + " do vetor 2 : ");
      vetor2[a] = scanner.nextInt();
      if (vetor2[a]==0){
        bar[0]=0;
      }
    }
    System.out.print("Vetor 1: ");
    for (int b=0;b<5;b++){
      System.out.print(vetor1[b]+ "  ");
    }
    System.out.print("\n");
    System.out.print("Vetor 2: ");
    for (int a=0;a<5;a++){
      System.out.print( vetor2[a] +  "  ");
    }
    System.out.print("\n");
    int[] vetorc;
    vetorc = new int[10];
    int c;
    c=0;
    for (int a=0; a < 5 ; a++){
      vetorc[c] = vetor1[a];
      c=c+2;
      vetorc[c-1] = vetor2[a];
    }
    System.out.print("VETOR CONCA    ");
    for (int a = 0 ; a <10; a++){
      System.out.print(  vetorc[a] + "  ");
    }
    //zero
    int conta=0;
    int[] vetaux;
    vetaux = vetorc;
    System.out.println("");
    for (int a = 0 ; a<10; a++){
      int b = a+1;
      for ( ;b<10; b++ ){
        if (vetorc [a] == vetaux [b]){
          vetaux[b]=0;
          conta++;
        b++;
        }
      }
    }
    System.out.print("SUBS ZERO      ");
    for (int a = 0 ; a <10; a++){
      System.out.print(vetaux[a] + "  ");
    }
    System.out.println("");

    //cresc
    int[] vetorcres;
    int b=0;
    int tam=0;
    vetorcres = new int[10];

    for (int a=0; a<10;a++){
      for ( ;b<10;b++){
        if (vetaux[a] > vetaux[b]){
          vetorcres[0]=vetaux[b];
        }
        else{
          vetorcres[a]=vetaux[b];
        }
      }
      b++;
    }

    System.out.print("VETOR CRESC    ");
    for (int a = 0 ; a <10; a++){
      System.out.print(vetorcres[a] + "  ");
    }
    System.out.println("");
  }
}
