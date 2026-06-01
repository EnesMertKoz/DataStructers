import tree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree agac = new BinaryTree();

        System.out.println("--- Ağaca Elemanlar Ekleniyor ---");
        // Rastgele sayılar ekliyoruz
        agac.insert(50); // İlk eklenen kök (Root) olur
        agac.insert(30); // 50'den küçük, sola gider
        agac.insert(70); // 50'den büyük, sağa gider
        agac.insert(20); // 50'den küçük sola, 30'dan küçük tekrar sola...
        agac.insert(40);
        agac.insert(60);
        agac.insert(80);

        System.out.println("Ağacın Küçükten Büyüğe Sıralı Hali (In-Order):");
        // Sihirli çıktı: Sayılar tamamen sıralı çıkmalı!
        agac.inOrder();
        System.out.println("\n--- Ağaçta Arama Testleri ---");
        System.out.println("40 sayısı ağaçta var mı? " + agac.search(40)); // true bekliyoruz
        System.out.println("95 sayısı ağaçta var mı? " + agac.search(95)); // false bekliyoruz
    }
}