public class Main{
    public static void main(String[] args){

        SingleLinkedList liste = new SingleLinkedList();


        liste.addLast(20);
        liste.addLast(30);

        liste.addFirst(10);

        liste.printList();

        liste.searchNode(20);
        liste.searchNode(99);
    }
}
