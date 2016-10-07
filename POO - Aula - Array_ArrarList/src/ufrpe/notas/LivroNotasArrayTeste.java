package ufrpe.notas;

import java.util.Scanner;

public class LivroNotasArrayTeste {

    public static void main(String[] args) {
        
        LivroNotasArray livroNotas = new LivroNotasArray(100);
        
        Scanner sc = new Scanner(System.in);
        double valorLido = 0;
        while(valorLido >= 0) {
            System.out.println("Digite uma nota (valor n�merico):");
            valorLido = sc.nextDouble();
            if (valorLido >= 0) {
                livroNotas.adicionarNota(valorLido);
            }
        }
        
        System.out.printf("Nota m�xima: %.2f \n", livroNotas.getMaiorNota());
        System.out.printf("Nota m�nima: %.2f \n", livroNotas.getMenorNota());
        System.out.printf("M�dia: %.2f \n", livroNotas.calculaMedia());
        
        sc.close();
    }

}
