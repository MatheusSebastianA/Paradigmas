public class FuncionarioHorista extends Funcionario{
    protected float valorHora, horasTrabalhadas;

    //Construturoes
    public FuncionarioHorista(){

    }

    public FuncionarioHorista(String nome, String estrangeiro, Data data_contratacao, float valor_hora, float horas_trabalhadas){
        super(nome, estrangeiro, data_contratacao);
        this.setValorHora(valor_hora);
        this.setHorasTrabalhadas(horas_trabalhadas);
    }

    //Get e Set
    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setHorasTrabalhadas(float horas_trabalhadas) {
        this.horasTrabalhadas = horas_trabalhadas;
    }

    public void setValorHora(float valor_hora) {
        this.valorHora = valor_hora;
    }

    @Override
    public String toString(){
       return super.toString() + " Valor hora: " + this.valorHora + " horas_trabalhadas: " + this.horasTrabalhadas;
    }

    @Override
    public float salarioFinal(){
        return this.valor_hora * this.horas_trabalhadas;
    }
}
