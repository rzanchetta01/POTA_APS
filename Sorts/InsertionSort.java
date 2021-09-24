package Sorts;
public class InsertionSort {
    
    private int comparacoes = 0;
       
    public int getComparacoes() {
        return comparacoes;
    }
    public void setComparacoes() {
        comparacoes ++;
    }
    
    public void resetComapacoes() {
        comparacoes = 0;
    }

   
        public void InsertionSortRecursivo(int vetor[], int n) {
            
        if (n <= 1) {
            return;
        }
                       
        int ultimo = vetor[n-1];
        int i = n-2;
      
        setComparacoes();
        while (i >= 0 && vetor[i] > ultimo) {   
            
            vetor[i+1] = vetor[i];
            i--;
        }
        vetor[i+1] = ultimo;

        InsertionSortRecursivo( vetor, n-1 );
    }
	
    
}
