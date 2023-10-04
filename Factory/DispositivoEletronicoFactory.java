public class DispositivoEletronicoFactory extends DispositivoFactory{
  public Dispositivo criarDispositivo(String tipo, Caracteristica carac){
    if(tipo == "Smartphone")
        return new Smartphone(carac);
    else if(tipo == "Notebook")
        return new Notebook(carac);
    else if(tipo == "Tablet")
        return new Tablet(carac);
    else
        return NULL;
    
  }  
}
