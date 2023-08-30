public class Principal{
    public static void main(String args[]){
        Funcionario_mensalista func1 = new Funcionario_mensalista("Joao", "sim", new Data(12, 12, 2013), 4000);
        Funcionario_horista func2 = new Funcionario_horista("Pedro", "não", new Data(11, 9, 2001), 35, 90);

        System.out.println(func1.toString());
        System.out.println((func2.toString()));

        System.out.println(func1.salarioFinal());
        System.out.println((func2.salarioFinal()));

    }
}