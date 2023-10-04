public class Principal{
  public static void main(String args[]){
    //Padrão Utilizando método Factory
    DispositivoFactory disp = new DispositivoEletronicoFactory();
    Dispositivo dispositivo = disp.criarDispositivo("Smartphone", new Caracteristica("laranja", 500, 12.6));

    
  }
}
