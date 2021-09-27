package Sorts;

public class MergeSort {

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

    public void mergeSort(int vetor[], int l, int m, int r) {
        
        int n1 = m - l + 1;
        int n2 = r - m;
      
        int L[] = new int[n1];
        int R[] = new int[n2];
          
        for (int i = 0; i < n1; ++i)
            L[i] = vetor[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = vetor[m + 1 + j];
       
        int i = 0, j = 0;
        
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                vetor[k] = L[i];
                i++;
            }
            else {
                vetor[k] = R[j];
                j++;
            }
            k++;
        }
       
        while (i < n1) {
            vetor[k] = L[i];
            i++;
            k++;
        }
       
        while (j < n2) {
            vetor[k] = R[j];
            j++;
            k++;
        }
    }
  
    public void ordena(int vetor[], int l, int r) {   

        setComparacoes();

        if (l < r) {
            
            int m =l+ (r-l)/2;
            
            ordena(vetor, l, m);
            ordena(vetor, m + 1, r);
             
            mergeSort(vetor, l, m, r);
        }
    }
}
