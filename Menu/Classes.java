/*jean carlos canova gondorek*/

class Classes{
  double parcela;
  double valortotal;
  double entrada;
  int nparcelas;
  double sobravalor;

  void valorprest(){
    /* juros 2% */
    if (entrada<valortotal){
      if(entrada > 0){
        valortotal=valortotal-entrada;
        parcela = valortotal/nparcelas;
        parcela = parcela*1.02;
        sobravalor = (parcela*nparcelas)-entrada;
      }
      else{
        parcela = valortotal/nparcelas;
        parcela = parcela*1.02;
        sobravalor = (parcela*nparcelas);
      }
      System.out.println("Valor das parcelas: " + parcela);
      System.out.println("Restante a ser pago: " + sobravalor);
      System.out.println("Valor total das parcelas: " + parcela*nparcelas+"\n\n\n");
    }
  }
  void antecip(double monant){
    /* desconto 2% */
    double newpar;
    newpar=parcela-monant;
    parcela = monant*1.02;
    sobravalor=sobravalor-parcela;
    nparcelas=nparcelas-1;
    System.out.println("Valor da parcela antecipada: " + parcela);
    System.out.println("Restante a ser pago: " + sobravalor);
  }
  void valoratraso(){
    /* juros 2% + multa de 2% */
    if (entrada<valortotal){
      if(entrada > 0){
        valortotal=valortotal-entrada;
        parcela = valortotal/nparcelas;
        parcela = parcela*1.04;
        sobravalor = (parcela*nparcelas)-entrada;
      }
      else{
        parcela = valortotal/nparcelas;
        parcela = parcela*1.04;
        sobravalor = (parcela*nparcelas);
      }
      System.out.println("Valor das parcelas: " + parcela);
      System.out.println("Restante a ser pago: " + sobravalor);
      System.out.println("Valor total das parcelas: " + parcela*nparcelas+"\n\n\n");
    }
  }

}
