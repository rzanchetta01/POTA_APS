import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import Sorts.BubbleSort;
import Sorts.InsertionSort;
import Sorts.SelectionSort;
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


        String path5 = "T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor5.csv";
        TestInsertionSort(vetor5, path5);
        TestSelectionSort(vetor5, path5);
        TestBubbleSort(vetor5, path5);
        
        
        
        String path10 = "T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor10.csv";
        TestInsertionSort(vetor10, path10);
        TestSelectionSort(vetor10, path10);
        TestBubbleSort(vetor10, path10);
        
        

        String path100 = "T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor100.csv";
        TestInsertionSort(vetor100, path100);
        TestSelectionSort(vetor100, path100);
        TestBubbleSort(vetor100, path100);
        
        

        String path1k = "T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor1000.csv";
        TestInsertionSort(vetor1k, path1k);
        TestSelectionSort(vetor1k, path1k);
        TestBubbleSort(vetor1k, path1k);
        
       

        String path10k = "T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor10000.csv";
        TestInsertionSort(vetor10k, path10k);
        TestSelectionSort(vetor10k, path10k);
        TestBubbleSort(vetor10k, path10k);
        
        

    }
    public static void GeraCSV(Integer mediaComparacoes, String nomeAlgoritmo, String path) {
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            
            bw.append(nomeAlgoritmo);
            bw.append(",");
            bw.append(mediaComparacoes.toString());
            bw.newLine();
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void RandomVet(int vetor[]) {

        Random rnd = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rnd.nextInt(20001);
        }    
    }

    public static void TestBubbleSort(int vetor[], String path) {

        long count = 0;
        BubbleSort bs = new BubbleSort();
        
        for (int i = 0; i <50; i++) {
            bs.BubbleSortRecursivo(vetor, vetor.length);
            System.out.println("Numero de comparações: " + bs.getComparacoes());
            count += bs.getComparacoes();
            bs.resetComapacoes();
        }

        count = count/50;
        int aux = (int) count;

        GeraCSV(aux, "BubbleSort", path);
    }
   
    public static void TestInsertionSort(int vetor[], String path) {

        long count = 0;
       
        InsertionSort is = new InsertionSort();
        
        for (int i = 0; i <50; i++) {
            is.InsertionSortRecursivo(vetor, vetor.length);
            System.out.println("Numero de comparações: " + is.getComparacoes());
            count += is.getComparacoes();
            is.resetComapacoes();
        }

        count = count/50;
        int aux = (int) count;

        GeraCSV(aux, "InsertionSort", path);  
    }

    public static void TestSelectionSort(int vetor[], String path) {

        long count = 0;
        SelectionSort ss = new SelectionSort();   

        for (int i = 0; i <50; i++) {
            ss.recurSelectionSort(vetor, vetor.length, 0);
            System.out.println("Numero de comparações: "+ ss.getComparacoes());   
            count += ss.getComparacoes();
            ss.resetComapacoes();
        }  

        count = count/50;
        int aux = (int) count;

        GeraCSV(aux, "SelectionSort", path);  
    }

    

    
}
