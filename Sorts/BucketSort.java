package Sorts;

import java.util.*;

public class BucketSort {

    private int comparacoes = 0;

    public double getComparacoes() {
        return comparacoes;
    }

    public void setComparacoes() {
        comparacoes++;
    }

    public void resetComapacoes() {
        comparacoes = 0;
    }

    public void binSort(int[] vetor, int n) {
       
        @SuppressWarnings("unchecked")
        List<Integer>[] listBucketSort = new List[n];

        for (int i = 0; i < n; i++) {
            listBucketSort[i] = new LinkedList<>();
        }

        for (int num : vetor) {
            listBucketSort[div(num, n)].add(num);
        }
      
        for (List<Integer> bucket : listBucketSort) {
            
            Collections.sort(bucket);
        }
        int index = 0;
        
        for (List<Integer> bucket : listBucketSort) {
            for (int num : bucket) {
                vetor[index++] = num;
            }
        }
    }

    private int div(int n, int numMax) {
        return n / numMax;
    }
}
