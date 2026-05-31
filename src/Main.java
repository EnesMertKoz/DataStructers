import algorithms.BubbleSort;
import algorithms.SelectionSort;
import algorithms.InsertionSort;

public class Main {
    public static void main(String[] args) {
        // Üç farklı algoritma için üç adet birbirinin aynısı karışık dizi oluşturuyoruz
        int[] dizi1 = {45, 12, 85, 32, 4, 67, 23};
        int[] dizi2 = {45, 12, 85, 32, 4, 67, 23};
        int[] dizi3 = {45, 12, 85, 32, 4, 67, 23};

        System.out.println("=== 1. BUBBLE SORT TESTİ ===");
        BubbleSort.sort(dizi1);
        diziYazdir(dizi1);

        System.out.println("\n=== 2. SELECTION SORT TESTİ ===");
        SelectionSort.sort(dizi2);
        diziYazdir(dizi2);

        System.out.println("\n=== 3. INSERTION SORT TESTİ ===");
        InsertionSort.sort(dizi3);
        diziYazdir(dizi3);
    }

    public static void diziYazdir(int[] arr) {
        for (int sayi : arr) {
            System.out.print(sayi + " ");
        }
        System.out.println();
    }
}