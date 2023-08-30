public class Funcionario_horista extends Funcionario{
    protected float valor_hora, horas_trabalhadas;

    //Construturoes
    public Funcionario_horista(){

    }

    public Funcionario_horista(String nome, String estrangeiro, Data data_contratacao, float valor_hora, float horas_trabalhadas){
        super(nome, estrangeiro, data_contratacao);
        this.setValor_hora(valor_hora);
        this.setHoras_trabalhadas(horas_trabalhadas);
    }

    //Get e Set
    public float getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public float getValor_hora() {
        return valor_hora;
    }

    public void setHoras_trabalhadas(float horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public void setValor_hora(float valor_hora) {
        this.valor_hora = valor_hora;
    }

    @Override
    public String toString(){
       return super.toString() + " Valor hora: " + this.valor_hora + " horas_trabalhadas: " + this.horas_trabalhadas;
    }

    @Override
    public float salarioFinal(){
        return this.valor_hora * this.horas_trabalhadas;
    }
}