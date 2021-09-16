import java.util.Random;

public class Main {
    

    public static void main(String[] args) {
        
        Random gerador = new Random();
        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(10);
        }

        int comparacoes = 0;
        BubbleSort b1 = new BubbleSort(comparacoes, vetor, vetor.length);
        
        b1.BubbleSortRecursivo(vetor, vetor.length, comparacoes);
        
       
        System.out.println(b1.getComparacoes());
        

    }
}
