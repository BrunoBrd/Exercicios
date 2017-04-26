
package Exercicios_Programacao1;
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float valorHipotenusa ;
        float resultadoHipotenusa ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro cateto: ");
        float pcat = sc.nextFloat();
        
        System.out.println("Informe o segundo cateto: ");
        float scat = sc.nextFloat();
        
        valorHipotenusa =  ((float) Math.pow(pcat, 2) + (float) Math.pow(scat, 2)) ;
        resultadoHipotenusa = (float)Math.pow(valorHipotenusa, (1.0/2));
        
        System.out.println("O valor da hipotenusa é :" + resultadoHipotenusa);
    }
    
}
