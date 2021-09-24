package Sorts;

public class HeapSort {
    
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

    public void ordena(int vetor[]) {

        
        
        for (int i = vetor.length / 2 - 1; i >= 0; i--)
        hpSort(vetor, vetor.length, i);
      
        for (int i = vetor.length - 1; i > 0; i--) {
           
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;
         
            hpSort(vetor, i, 0);
        }
    }
    
    public void hpSort(int vetor[], int n, int i) {
        int maiorValor = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
        setComparacoes();
        if (l < n && vetor[l] > vetor[maiorValor]) {
            maiorValor = l;
        }
             
        setComparacoes();
        if (r < n && vetor[r] > vetor[maiorValor]) {
            maiorValor = r;
        }
            
        setComparacoes();
        if (maiorValor != i) {
            int inverte = vetor[i];
            vetor[i] = vetor[maiorValor];
            vetor[maiorValor] = inverte;
             
            hpSort(vetor, n, maiorValor);
        }
    }
}
