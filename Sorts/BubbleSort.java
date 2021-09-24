package Sorts;
public class BubbleSort {
    
    private int comparacoes;

    public int getComparacoes() {
        return comparacoes;
    }
    public void setComparacoes() {
        comparacoes ++;
    }

    public void resetComapacoes() {
        comparacoes = 0;
    }

    public void BubbleSortRecursivo(int vetor[], int n) {

        setComparacoes();
        if (n == 1) { 
            return;                      
        }           
            
        for (int i=0; i<n-1; i++) {

            setComparacoes();
            if (vetor[i] > vetor[i+1])
            {               
                int temp = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = temp;
            }
        }

           
        BubbleSortRecursivo(vetor, n-1);
    }
}
