import java.util.Scanner;

public class Idade{

    public static void main(String[] args){
        int[] vetIdades = new int[10];
        float media = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.print("Digite a " + i);
            System.out.println("º idade:");
            vetIdades[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++)
            media = media + vetIdades[i];
        media = media/10;
        System.out.println("Media é: " + media);

        System.out.println("Idades acima da media: ");
        for(int i = 0; i < 10; i++){
            if (vetIdades[i] > media) {
                System.out.println("Pessoa " + (i + 1) + ": " + vetIdades[i]);
            }
        }

        System.out.println("Idades abaixo da media: ");
        for(int i = 0; i < 10; i++){
            if (vetIdades[i] < media) {
                System.out.println("Pessoa " + (i + 1) + ": " + vetIdades[i]);
            }
        }
    }
     
}
