
package Exercicios_Programacao1;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1;
        float nota2;
        float resultado;
        
        System.err.println("Digite a primeira nota: ");
        nota1 = Integer.parseInt(entrada.nextLine());
        
        System.err.println("Digite a segunda nota: ");
        nota2 = Integer.parseInt(entrada.nextLine());
        
        resultado = nota1 + nota2;
        
        if  (resultado/2>=6){
            
            System.err.println("Aprovado");
        }
        if (resultado/2>=10) {
             System.err.println("Parabéns,aprovado com nota maxima");
        }
        
        else {
            System.err.println("Sinto muito, você não foi Aprovado.");
        }
    }
    
}
