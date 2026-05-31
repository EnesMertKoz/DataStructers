
import stack.StackLinkedList;

public class Main {
    public static void main(String[] args) {
        StackLinkedList yigin = new StackLinkedList();

        System.out.println("--- Elemanlar Yığılıyor (Push) ---");
        yigin.push(10); // En altta
        yigin.push(20);
        yigin.push(30); // En üstte (Zirve)

        System.out.println("Şu an en üstteki eleman (Peek): " + yigin.peek());
        // Çıktı: 30 bekliyoruz.

        System.out.println("\n--- Elemanlar Çıkarılıyor (Pop) ---");
        System.out.println("Çıkarılan eleman: " + yigin.pop()); // 30 çıkar
        System.out.println("Çıkarılan eleman: " + yigin.pop()); // 20 çıkar

        System.out.println("\nŞu an en üstteki eleman (Peek): " + yigin.peek());
        // Çıktı: 10 bekliyoruz.
    }
}