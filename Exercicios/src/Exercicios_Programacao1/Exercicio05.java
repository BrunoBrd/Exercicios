
package Exercicios_Programacao1;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int primeroOperando;
        int segundoOperando;
        String operacao;
        int control=0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro operando: ");
        primeroOperando = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Digite o operador: ");
        operacao = entrada.nextLine();

        System.out.println("Digite o segundo operando: ");
        segundoOperando = Integer.parseInt(entrada.nextLine());
       

        if(operacao.equals("+")){
            System.out.println("O resultado é:" + (primeroOperando + segundoOperando));
            control++;
        }
        if(operacao.equals("-")){
            System.out.println("O Resultado da Soma é:" + (primeroOperando + segundoOperando));
            control++;
        }
        if(operacao.equals("*")){
            System.out.println("O Resultado da Soma é:" + (primeroOperando + segundoOperando));
            control++;
        }
        if(operacao.equals("/")){
            System.out.println("O Resultado da Soma é:" + (primeroOperando + segundoOperando));
            control++;
        }

        if(control == 0){
            System.out.println("Operação inválida, tente Novamente!");
        }
    }
    
}
