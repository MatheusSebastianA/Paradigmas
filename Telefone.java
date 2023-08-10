public class Telefone{
    int DDDI;
    int DDD;
    int numero;

    public void cadastrar(int DDDI, int DDD, int numero){
        this.DDDI = DDDI;
        this.DDD = DDD;
        this.numero = numero;
    }

    public void exibir(){
        System.out.print("+" + this.DDDI);
        System.out.print(" (" + this.DDD + ") ");
        System.out.println(this.numero);
    } 
    public static void main(String[] args){
        Telefone[] vetTelefones = new Telefone[5];
        
        for (int i = 0; i < 5; i++){
            vetTelefones[i] = new Telefone();
            vetTelefones[i].cadastrar(1,35, 934878991 + i);
            vetTelefones[i].exibir();
        }
    }    
}
