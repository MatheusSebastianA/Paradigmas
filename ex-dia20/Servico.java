public class Servico implements Loja{
    protected char forma;
    protected int duracao;

    public Servico(char forma, int duracao){
        this.setForma(forma);
        this.setDuracao(duracao);
    }

    public int getDuracao() {
        return duracao;
    }

    public char getForma() {
        return forma;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setForma(char forma) {
        if(this.forma == 'R' ||  this.forma == 'F' || this.forma == 'D' )
            this.forma = forma;
    }


    public void acionar_garantia(){
        System.out.println("Acionando garantida do serviço");
    }

    public void vender(){
        System.out.println("Vendendo serviço");
    }

}