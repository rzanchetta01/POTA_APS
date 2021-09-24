package Sorts;
public class BubbleSort {
    
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

    public void bubbleSort(int vetor[]) {
    
        for (int i = 0; i < vetor.length-1; i++) {
            setComparacoes();
            for (int j = 0; j < vetor.length-i-1; j++) {
                setComparacoes();
                if (vetor[j] > vetor[j+1])
                {             
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }                                
    }
}
