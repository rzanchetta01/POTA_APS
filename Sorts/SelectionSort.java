package Sorts;
public class SelectionSort {
    
    private int comparacoes = 1;

    public double getComparacoes() {
        return comparacoes;
    }
    
    public void setComparacoes() {
        comparacoes ++;
    }
    
    public void resetComapacoes() {
        comparacoes = 1;
    }

    public void selectionSort(int vetor[]) {

        for (int i = 0; i < vetor.length-1; i++) {
            setComparacoes();
            int min_idx = i;

            for (int j = i+1; j < vetor.length; j++) {
                setComparacoes();
                if (vetor[j] < vetor[min_idx]) {
                    min_idx = j;
                }
                    
            }
            
            int temp = vetor[min_idx];
            vetor[min_idx] = vetor[i];
            vetor[i] = temp;
        }
    }
}
