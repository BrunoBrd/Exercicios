
package Exercicios_Programacao1;
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Exercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       System.out.println("Informe o numero que deseja converter: ");
       int numero = sc.nextInt(); 
       
       String bin = Integer.toString(numero, 2);
       
       System.out.println("Seu numero convertido em binário é : " + bin);
    }
    
}
