public class Data{
    protected int mes, dia, ano;

    public Data(){

    }

    public Data(int dia, int mes, int ano){
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        if(mes > 0 && mes < 13)
            return mes;
    }
    
    public int getAno() {
        return ano;
    }


    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString(){
       return "Dia: " + this.dia + " Mês: " + this.mes + " Ano: " + this.ano;
    }
}