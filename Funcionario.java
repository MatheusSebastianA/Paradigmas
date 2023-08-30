public class Funcionario{
    protected String nome, estrangeiro;
    protected Data data_contratacao;

    //Construtores
    public Funcionario(){

    }

    public Funcionario(String nome, String estrangeiro, Data data_contratacao){
        this.setNome(nome);
        this.setEstrangeiro(estrangeiro);
        this.setData_contratacao(data_contratacao);
    }

    //Get e Set
    public String getNome() {
        return nome;
    }

    public String getEstrangeiro() {
        return estrangeiro;
    }

    public Data getData_contratacao() {
        return data_contratacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstrangeiro(String estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public void setData_contratacao(Data data_contratacao) {
        this.data_contratacao = data_contratacao;
    }

    @Override
    public String toString(){
       return "Nome: " + this.nome + " Estrangeiro: " + this.estrangeiro + " Data: " + this.data_contratacao;
    }

    public float salarioFinal(){
        return 0;
    }
}