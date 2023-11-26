public class FuncionarioMensalista extends Funcionario{
    protected float salarioMensal;

    //Construtores
    public FuncionarioMensalista(){

    }

    public FuncionarioMensalista(String nome, String estrangeiro, Data data_contratacao, float salario_mensal){
        super(nome, estrangeiro, data_contratacao);
        this.setSalarioMensal(salario_mensal);
    }

    //Get e Set
    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salario_mensal) {
        this.salarioMensal = salario_mensal;
    }

    @Override
    public String toString(){
       return super.toString() + " Salário: " + this.salarioMensal;
    }

    @Override
    public float salarioFinal(){
        return this.salario_mensal;
    }
}
