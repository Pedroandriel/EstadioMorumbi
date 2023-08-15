import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Estadiomorumbi {
    public static void main(String[] args) {
           /** Declarar as Variaveis */

           String nome;
           int idade, corCamisa;

           /** coletar dado */

      Scanner teclado = new Scanner(System.in);
      System.out.println( "Bem vindo !!!" );
      System.out.println("informe seu nome: ");
      nome = teclado.next();
      System.out.println("Digite sua idade: ");
      idade = teclado.nextInt();
      System.out.println("Informe a cor da sua camisa: ");
      corCamisa = teclado.nextInt();

       switch (corCamisa) {
           case 1:

               System.out.println("Arquibancada A");
               break;

           case 2:
               System.out.println("Arquibancada B");
               break;

           case 3:
               System.out.println("Arquibancada C");

               break;

           case 4:
               System.out.println("Arquibancada D");
               break;

           case 5:
               System.out.println("Arquibancada E");
               break;

           case 6:
               System.out.println("Arquibancada F");
               break;


       }
    }
}
