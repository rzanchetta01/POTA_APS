import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import Sorts.*;
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

        //Caminho de arquivo dos CSV
        String path5 = "T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor5.csv";
        String path10 = "T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor10.csv";
        String path100 = "T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor100.csv";
        String path1k = "T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor1000.csv";
        String path10k = "T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor10000.csv";

        //Faz os 50 testes com os 9 algoritmos de teste em cada tamanho de vetor, além de armazenar os resultados usando o GeraCSV
        GeraTests(vetor5, path5);
        GeraTests(vetor10, path10);
        GeraTests(vetor100, path100);
        GeraTests(vetor1k, path1k);
        GeraTests(vetor10k, path10k);
     
    }

    public static void GeraCSV(Double mediaComparacoes, String nomeAlgoritmo, String path) {
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            
            bw.append(nomeAlgoritmo);
            bw.append("|");
            bw.append(String.format("%.2f", mediaComparacoes).toString());
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

    public static void GeraTests(int vetor[], String path) {

        TestHeapSort(vetor, path);  
        TestCountSort(vetor, path);
        TestBucketSort(vetor, path);
        TestRadixSort(vetor, path);
        TestInsertionSort(vetor, path);
        TestMergeSort(vetor, path);
        TestQuickSort(vetor, path);
        TestBubbleSort(vetor, path);
        TestSelectionSort(vetor, path);   
    }

    public static void TestBubbleSort(int vetor[], String path) {

        double count = 0;
        BubbleSort bs = new BubbleSort();
        
        for (int i = 0; i <50; i++) {
            bs.bubbleSort(vetor);
            System.out.println("Numero de comparações: " + bs.getComparacoes());
            count += bs.getComparacoes();
            bs.resetComapacoes();
        }

        count = count/50;
        

        GeraCSV(count, "BubbleSort", path);
    }
   
    public static void TestInsertionSort(int vetor[], String path) {

        double count = 0;
       
        InsertionSort is = new InsertionSort();
        
        for (int i = 0; i <50; i++) {
            is.insertionSort(vetor);
            System.out.println("Numero de comparações: " + is.getComparacoes());
            count += is.getComparacoes();
            is.resetComapacoes();
        }

        count = count/50;
        

        GeraCSV(count, "InsertionSort", path);  
    }

    public static void TestSelectionSort(int vetor[], String path) {

        double count = 0;
        SelectionSort ss = new SelectionSort();   

        for (int i = 0; i <50; i++) {
            ss.selectionSort(vetor);
            System.out.println("Numero de comparações: "+ ss.getComparacoes());   
            count += ss.getComparacoes();
            ss.resetComapacoes();
        }  

        count = count/50;
        
        GeraCSV(count, "SelectionSort", path);  
    }

    public static void TestQuickSort(int vetor[], String path) {

        double count = 0;
        QuickSort qs = new QuickSort();

        for (int i = 0; i <50; i++) {
            qs.quickSort(vetor, 0, vetor.length -1);
            System.out.println("Numero de comparações: "+ qs.getComparacoes());   
            count += qs.getComparacoes();
            qs.resetComapacoes();
        }  

        count = count/50;
        

        GeraCSV(count, "QuickSort", path);  
    }

    public static void TestMergeSort(int vetor[], String path) {

        double count = 0;
        MergeSort ms = new MergeSort();

        for (int i = 0; i <50; i++) {
            ms.ordena(vetor, 0, vetor.length - 1);
            System.out.println("Numero de comparações: "+ ms.getComparacoes());   
            count += ms.getComparacoes();
            ms.resetComapacoes();
        }  

        count = count/50;
        
        GeraCSV(count, "MergeSort", path);  
    
    }

    public static void TestHeapSort (int vetor[], String path) {

        double count = 0;
        HeapSort hs = new HeapSort();

        for (int i = 0; i <50; i++) {
            hs.ordena(vetor);
            System.out.println("Numero de comparações: "+ hs.getComparacoes());   
            count += hs.getComparacoes();
            hs.resetComapacoes();
        }  

        count = count/50;
        
        GeraCSV(count, "HeapSort", path);  
    }

    public static void TestCountSort (int vetor[], String path) {

        double count = 0;
        CountSort cs = new CountSort();

        for (int i = 0; i <50; i++) {

            cs.countSort(vetor);       
            System.out.println("Numero de comparações: "+ cs.getComparacoes());   
            count += cs.getComparacoes();
            cs.resetComapacoes();
        }

        count = count/50;
        
        GeraCSV(count, "CountSort", path);  
    }  
    
    public static void TestBucketSort(int vetor[] , String path) {

        double count = 0;
        BucketSort bs = new BucketSort();

        for (int i = 0; i <50; i++) {

            bs.binSort(vetor, 20001);
            System.out.println("Numero de comparações: "+ bs.getComparacoes());   
            count += bs.getComparacoes();
            bs.resetComapacoes();
        }

        count = count/50;

        GeraCSV(count, "BucketSort", path);  
    }

    public static void TestRadixSort(int vetor[] , String path) {

        double count = 0;
        RadixSort rs = new RadixSort();

        for (int i = 0; i <50; i++) {

            rs.radixsort(vetor, vetor.length);
            System.out.println("Numero de comparações: "+ rs.getComparacoes());   
            count += rs.getComparacoes();
            rs.resetComapacoes();
        }

        count = count/50;

        GeraCSV(count, "BucketSort", path);  
    }
}

