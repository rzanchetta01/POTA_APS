package Sorts;
public class InsertionSort {
    
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

   
    public void insertionSort(int vetor[]) {

        for (int i = 1; i < vetor.length; ++i) {
            setComparacoes();
            int aux = vetor[i];
            int j = i - 1;
 
            while (j >= 0 && vetor[j] > aux) {
                
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }

            vetor[j + 1] = aux;
        }
    }
	
    
}
