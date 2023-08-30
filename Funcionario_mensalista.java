public class Funcionario_mensalista extends Funcionario{
    protected float salario_mensal;

    //Construtores
    public Funcionario_mensalista(){

    }

    public Funcionario_mensalista(String nome, String estrangeiro, Data data_contratacao, float salario_mensal){
        super(nome, estrangeiro, data_contratacao);
        this.setSalario_mensal(salario_mensal);
    }

    //Get e Set
    public float getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(float salario_mensal) {
        this.salario_mensal = salario_mensal;
    }

    @Override
    public String toString(){
       return super.toString() + " Salário: " + this.salario_mensal;
    }

    @Override
    public float salarioFinal(){
        return this.salario_mensal;
    }
}