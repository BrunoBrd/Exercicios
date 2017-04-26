
package Exercicios_Programacao1;

/**
 *
 * @author Bruno
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        byte minhaIdade = 18;
        String meuNome = "Bruno Brandao\n";
        float meuPeso = 68.5f;
        String tipoSanguineo = "A+";
        String meuAniversario = "15-02-99";
        byte numeroCalcado = 40;
        String casadoOun = "n";
        System.out.printf("Idade: %d\n", minhaIdade);
        System.out.printf("Nome: %s", meuNome);
        System.out.printf("Peso: %.2fKg\n", meuPeso);
        System.out.printf("Tipo Sanguineo: %s \n", tipoSanguineo);
        System.out.printf("Data de Aniversário: %s \n", meuAniversario);
        System.out.printf("Numero do calçado: %d \n", numeroCalcado);
        System.out.printf("Casado? [s/n]: %s \n", casadoOun);
    }
    
}
