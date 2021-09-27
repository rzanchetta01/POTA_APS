package Sorts;

import java.util.Arrays;

public class CountSort {
    
    private int comparacoes = 0;

    public double getComparacoes() {
        return comparacoes;
    }
    public void setComparacoes() {
        comparacoes ++;
    }

    public void resetComapacoes() {
        comparacoes = 0;
    }

    public void countSort(int[] vetor) {

        int max = Arrays.stream(vetor).max().getAsInt();
        int min = Arrays.stream(vetor).min().getAsInt();
        
        int alcance = max - min + 1;
        int count[] = new int[alcance];
        int saida[] = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            count[vetor[i] - min]++;
        }
 
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
 
        for (int i = vetor.length - 1; i >= 0; i--) {
            saida[count[vetor[i] - min] - 1] = vetor[i];
            count[vetor[i] - min]--;
        }
 
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = saida[i];
        }
    }
}
