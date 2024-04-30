class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}public class LL {
    Node head = null;
    void insertAtStart(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }newNode.next = head;
        head = newNode;
        return;
    }void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }temp.next = newNode;
        return;
    }int getLength(){
        int n = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            n++;
        }return n;
    }void insertAtKthPos(int k, int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }int n = getLength();
        if(k==1){
            insertAtStart(val);
        }else if(k==n+1){
            insertAtEnd(val);
        }else{
            Node temp = head;
            for(int i=0; i<k-2; i++){
                temp = temp.next;
            }newNode.next = temp.next;
            temp.next = newNode;
        }return;
    }void deleteAtStart(){
        if(head==null){
            return;
        }head = head.next;
        return;
    }void deleteAtEnd(){
        if(head==null){
            return;
        }Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }temp.next = null;
        return;
    }void deleteAtKthPos(int k){
        if(head==null){
            return;
        }int n = getLength();
        if(k==1){
            deleteAtStart();
        }else if(n==k){
            deleteAtEnd();
        }else {
            Node temp = head;
            for(int i=0;i<k-2;i++){
                temp = temp.next;
            }temp.next = temp.next.next;
        }return;
    }void reverse(){
        Node prev = null;
        Node temp = head;
        while(temp!=null){
            Node dup = temp.next;
            temp.next = prev;
            prev = temp;
            temp = dup;
        }head = prev;
        return;
    }void display(){
        if(head==null){
            return;
        }Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }System.out.println();
        return;
    }public static void main(String[] args) {
        LL ll = new LL();
        for(int i=1; i<=5; i++){
            ll.insertAtEnd(i);
        }ll.display();
        ll.insertAtStart(0);
        ll.display();
        ll.insertAtKthPos(3,6);
        ll.display();
        ll.insertAtKthPos(1,7);
        ll.display();
        ll.insertAtKthPos(9,8);
        ll.display();
        ll.deleteAtStart();
        ll.display();
        ll.deleteAtEnd();
        ll.display();
        ll.deleteAtKthPos(3);
        ll.display();
        ll.deleteAtKthPos(1);
        ll.display();
        ll.deleteAtKthPos(5);
        ll.display();
        ll.reverse();
        ll.display();
    }
}
