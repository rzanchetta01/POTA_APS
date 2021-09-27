package Sorts;

import java.util.Arrays;

public class RadixSort {
    
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

    private int getMax(int vetor[], int n) {

        int maxValue = vetor[0];

        for (int i = 1; i < n; i++) {

            setComparacoes();
            if (vetor[i] > maxValue) {

                maxValue = vetor[i];
            }          
        }
           
        return maxValue;
    }
     
    private void countSort(int vetor[], int n, int expoente) {

        int saida[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        for (i = 0; i < n; i++) {

            count[(vetor[i] / expoente) % 10]++;
        }
            
 
        for (i = 1; i < 10; i++) {

            count[i] += count[i - 1];
        }
            
 
        for (i = n - 1; i >= 0; i--) {

            saida[count[(vetor[i] / expoente) % 10] - 1] = vetor[i];
            count[(vetor[i] / expoente) % 10]--;
        }

        for (i = 0; i < n; i++) {

            vetor[i] = saida[i];
        }
            
    }
 
    public void radixsort(int vetor[], int n) {

        int aux = getMax(vetor, n);

        for (int expoente = 1; aux / expoente > 0; expoente *= 10) {

            countSort(vetor, n, expoente);
        }
           
    }
}
