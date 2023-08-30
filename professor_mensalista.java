public class professor_mensalista extends Funcionario_mensalista{
    private int aulas_dadas;

    //Construtores
    public professor_mensalista(){

    }

    public professor_mensalista(String nome, String estrangeiro, Data data_contratacao, float salario_mensal){
        super(nome, estrangeiro, data_contratacao);
    }

    //Get e Set
    public int getAulas_dadas() {
        return aulas_dadas;
    }

    public void setAulas_dadas(int aulas_dadas) {
        this.aulas_dadas = aulas_dadas;
    }

    //Metodos
    public void darAula(){
        
    }
}