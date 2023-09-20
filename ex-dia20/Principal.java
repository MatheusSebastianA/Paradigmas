import java.util.*;

public class Principal{
    public static void main(String[] args){
        ArrayList<Loja> lista = new ArrayList<Loja>();
            
        Loja serv1 = new Servico('D', 10);
        Loja prod1 = new ProdutoEletronico("Escova", "Brastemp", 2);

        Iterator<Loja> i = lista.iterator();

        lista.add(serv1);
        lista.add(prod1);

        for(Loja item: lista){
            item.acionar_garantia();
            item.vender();
        }
            
        }
    
}