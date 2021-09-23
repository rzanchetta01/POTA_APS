public class SelectionSort {
    
    private int comparacoes;

    public int getComparacoes() {
        return comparacoes;
    }
    public void setComparacoes() {
        comparacoes ++;
    }

    public void recurSelectionSort(int vetor[], int n, int index) {
       
        if (index == n) {
            return;
        }
               
        int aux = MenorValor(vetor, n-1, index);
        
        if (aux != index){

           int temp = vetor[aux];
           vetor[aux] = vetor[index];
           vetor[index] = temp;
        }
       
        recurSelectionSort(vetor, n, index + 1);
    }

    private int MenorValor(int vetor[], int j, int index) {   

        setComparacoes();
        if (index == j) {
            return index;
        }

        int aux = MenorValor(vetor, j, index + 1);
      
        return (vetor[index] < vetor[aux]) ? index : aux;
    }
}
