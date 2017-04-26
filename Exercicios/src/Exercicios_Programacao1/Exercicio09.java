
package Exercicios_Programacao1;
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o numero da matriz que deseja: ");
        int matriz = sc.nextInt();
        
        for (int i = 0; i < matriz + 1 ; i++) {
            
            for (int v = 0; v < matriz; v++) {
                
            System.out.println("\n/" + v + "-" + i + "/\n");
            }
        
        }
    }
    
}
