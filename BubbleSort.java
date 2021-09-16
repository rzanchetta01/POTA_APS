public class BubbleSort {
    
    int comparacoes;
    int vetor[] = new int[5];
    int n;


    public BubbleSort(int comparacoes, int vetor[], int n) {
        this.comparacoes = comparacoes;       
        this.n = n;
        this.vetor = vetor;
    }

    public int getComparacoes() {
        return comparacoes;
    }
    public void setComparacoes() {
        comparacoes ++;
    }

    public void BubbleSortRecursivo(int vetor[], int n, int comparacoes) {

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
            
        BubbleSortRecursivo(vetor, n-1, comparacoes);
    }
}
