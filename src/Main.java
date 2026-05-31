import queue.QueueLinkedList;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList kuyruk = new QueueLinkedList();

        System.out.println("--- İnsanlar Kuyruğa Giriyor (Enqueue) ---");
        kuyruk.enqueue(10); // İlk gelen (En önde)
        kuyruk.enqueue(20);
        kuyruk.enqueue(30); // Son gelen (En arkada)

        System.out.println("Şu an en öndeki eleman (Peek): " + kuyruk.peek());
        // Çıktı: 10 bekliyoruz.

        System.out.println("\n--- İşlemi Bitenler Kuyruktan Çıkıyor (Dequeue) ---");
        System.out.println("Kuyruktan çıkan: " + kuyruk.dequeue()); // 10 çıkar
        System.out.println("Kuyruktan çıkan: " + kuyruk.dequeue()); // 20 çıkar

        System.out.println("\nŞu an sıra kimde? (Peek): " + kuyruk.peek());
        // Çıktı: 30 bekliyoruz.
    }
}