
package Exercicios_Programacao1;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota = 0, media = 0, soma = 0;
         int contador = 0;
 
         System.out.print("Digite uma nota: ");
        Scanner n = new Scanner(System.in);
         nota = n.nextFloat();
         while (nota != -1) {
             soma += nota;
             contador++;
             System.out.print("Digite uma nota: ");
             nota = n.nextFloat();
         }
                 
         media = soma / contador;
         System.out.printf("\nQuantidade de notas: %d", contador);
         System.out.printf("\nA Soma: %s ", soma);
         System.out.printf("\nA média das notas é %.2f \n", media);
    }
    
}
