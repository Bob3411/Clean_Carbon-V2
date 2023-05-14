package projectoPI;

import java.util.Arrays;

public class GraficoBarrasEmpilhadas {

    public static void GerarGrafico(int[] valores,String[] cores) {
        ///int[] valores = {3, 5, 2, 4}; // Valores para cada barra
        //String[] cores = {"\u001B[31m", "\u001B[32m", "\u001B[34m", "\u001B[35m"}; // Cores para cada valor

        int alturaMaxima = Arrays.stream(valores).max().orElse(0); // Altura máxima das barras

        for (int linha = alturaMaxima; linha > 0; linha--) {
            for (int coluna = 0; coluna < valores.length; coluna++) {
                if (valores[coluna] >= linha) {
                    System.out.print(cores[coluna] + "█\u001B[0m"); // Caractere para representar a barra
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
