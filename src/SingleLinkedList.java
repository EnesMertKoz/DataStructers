public class SingleLinkedList {
    private Node head;
    
    public SingleLinkedList(){
        this.head = null;
    }
    public void addLast(int data){
        if(head == null) {
            head = new Node(data);
            
        } else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
                //burada tempimiz en son vagonun üzerinde durur 
            }
            temp.next = new Node(data);
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

    }
    public void printList(){
        Node temp = head;
        if(temp == null) {
            System.out.println("Liste boş.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public void searchNode (int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                System.out.println("\nBu sayı listede var.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Sayı listede bulunamadı.");
    }
}
