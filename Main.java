import java.util.Random;

public class Main {
    

    public static void main(String[] args) {
        
        //Cria os vetores para teste
        int vetor5[] = new int[5];
        int vetor10[] = new int[10];
        int vetor100[] = new int[100];
        int vetor1k[] = new int[1000];
        int vetor10k[] = new int[10000];

        //Adcionar valores aleatórios dentro
        RandomVet(vetor5);
        RandomVet(vetor10);
        RandomVet(vetor100);
        RandomVet(vetor1k);
        RandomVet(vetor10k);

        //Teste de comparações totais nos vetores usando BubbleSort
        TestBubbleSort(vetor10);
        TestBubbleSort(vetor10);
        TestBubbleSort(vetor100);
        TestBubbleSort(vetor1k);
        TestBubbleSort(vetor10k);       
    }

    public static void RandomVet(int vetor[]) {

        Random rnd = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rnd.nextInt(20001);
        }    
    }

    public static void TestBubbleSort(int vetor[]) {

        BubbleSort bs = new BubbleSort();
        bs.BubbleSortRecursivo(vetor, vetor.length);
        System.out.println("Numero de comparações: "+bs.getComparacoes());
    }
   
}
