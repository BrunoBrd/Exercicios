
package Exercicios_Programacao1;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Informe um número:");
        x = sc.nextInt();
        if (x%2==0){
          System.out.printf("O numero é par\n");  
        }
        else {
            System.out.printf("O numero é impar\n");
        }
    }
    
}
