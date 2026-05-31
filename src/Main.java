import algorithms.BubbleSort;

public class Main {
    public static void main(String[] args) {
        // Tamamen karışık ve düzensiz bir dizi oluşturuyoruz
        int[] dizi = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("--- Sıralamadan Önceki Dizi ---");
        diziYazdir(dizi);

        // Sihirli dokunuş: Yazdığın algoritmayı çağırıyoruz
        BubbleSort.sort(dizi);

        System.out.println("\n--- Bubble Sort Sonrası Sıralanmış Dizi ---");
        diziYazdir(dizi);
    }

    // Diziyi ekrana şık bir şekilde basmak için yardımcı metot
    public static void diziYazdir(int[] arr) {
        for (int sayi : arr) {
            System.out.print(sayi + " ");
        }
        System.out.println();
    }
}