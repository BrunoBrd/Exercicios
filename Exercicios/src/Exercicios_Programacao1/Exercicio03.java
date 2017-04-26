
package Exercicios_Programacao1;

/**
 *
 * @author Bruno
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            int a = 3;
            int b = 1;
            int c = b + 1;
            int d = c > ++b ? (a - 3) : b;
            int e = 4;
        if( d > a && b + 1 < a || b > 1){
        c += 7;}
        if( -7 >= -c){
        a -= 4;}
        else
        d *= 2;
        e = ++d % 3;
        b = d++ % 3;
                System.err.printf("Valor de a: %s \n", a);
                
                System.err.printf("Valor de b: %s \n", b);
                
                System.err.printf("Valor de c: %s \n", c);
                
                System.err.printf("Valor de d: %s \n", d);
                
                System.err.printf("Valor de e: %s \n", e);
        
        /*Valor de a: -1 
        *Valor de b: 0 
        *Valor de c: 9 
        *Valor de d: 4 
        *Valor de e: 0 
        */
    }
    
}
