package Sorts;

public class QuickSort {
    
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

    public void InverteValor(int vetor[], int i, int j) {
        
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;

    }

    public int particiona(int vetor[], int menor, int maior) {
        
        int base = vetor[maior]; 
        int i = (menor - 1); 
       
        for(int j = menor; j <= maior - 1; j++) {
            setComparacoes();
            if (vetor[j] < base) 
            {
                
                i++; 
                InverteValor(vetor, i, j);
            }
        }
        
        InverteValor(vetor, i + 1, maior);
        return (i + 1);
    }
  
    public void quickSort(int vetor[], int menor, int maior) {
        
        if (menor < maior) {
                       
            int pi = particiona(vetor, menor, maior);
    
            quickSort(vetor, menor, pi - 1);
            quickSort(vetor, pi + 1, maior);
        }
    }
}
