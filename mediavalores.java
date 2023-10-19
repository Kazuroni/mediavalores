package mediavalores;

import java.util.Random;

public class mediavalores {

    public static void main(String[] args) {
        // Tamanho do array
        int tamanhoArray = 20;

        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Cria um array para armazenar os números aleatórios
        int[] numerosAleatorios = new int[tamanhoArray];

        // Preenche o array com números aleatórios entre 1 e 100
        for (int i = 0; i < tamanhoArray; i++) {
            numerosAleatorios[i] = random.nextInt(100) + 1;
        }

        // Calcula a média dos números no array
        int soma = 0;
        for (int i = 0; i < tamanhoArray; i++) {
            soma += numerosAleatorios[i];
        }

        double media = (double) soma / tamanhoArray;

        // Imprime o array de números aleatórios
        System.out.println("Array de números aleatórios:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(numerosAleatorios[i] + " ");
        }

        // Imprime a média dos números
        System.out.println("\nMédia dos números: " + media);
    }
}
