public class ProdutoEletronico implements Loja{
    protected String nomeFabricante, marca;
    protected int peso;


    public ProdutoEletronico(String nomeFabricante, String marca, int peso){
        this.setNomeFabricante(nomeFabricante);
        this.setMarca(marca);
        this.setPeso(peso);
    }

    public String getMarca() {
        return marca;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public float getPeso() {
        return peso;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }



    public void acionar_garantia(){
        System.out.println("Acionando garantida do produto eletronico");
    }

    public void vender(){
        System.out.println("Vendendo produto eletronico");
    }


}