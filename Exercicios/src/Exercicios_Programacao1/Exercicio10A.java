
package Exercicios_Programacao1;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno
 */
public class Exercicio10A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Object[] cidadeObject = new Object[5];
        String cidadeescolhida;

	int escolha = 0;

	do {
            cidadeescolhida= JOptionPane.showInputDialog(null, "Digite uma cidade que deseja");
            
            if (!cidadeescolhida.equals("")) {
            cidadeObject[escolha] = cidadeescolhida;
            System.out.println(cidadeObject[escolha]);
            escolha++;
            }
	} while (escolha < 5);  
    }
    
}
