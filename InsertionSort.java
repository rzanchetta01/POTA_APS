public class InsertionSort {
    
    private int comparacoes = 0;
       
    public int getComparacoes() {
        return comparacoes;
    }
    public void setComparacoes() {
        comparacoes ++;
    }

   public void InsertionSortRecursivo(int vetor[], int i,  int n) {       
        
        
        int value = vetor[i];
        int j = i;

        while (j > 0 && vetor[j - 1] > value) {                        
            vetor[j] = vetor[j - 1];
            j--;
        }
        vetor[j] = value;  
        
        if (i + 1 <= n) {
            
            InsertionSortRecursivo(vetor, i + 1, n);
        }
   
    }
}
