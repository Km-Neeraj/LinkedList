import java.util.*;

class Node {
    int data;
    Node next;
    Node head = null;

    void createList(int n) {
        Node tail = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements-------");

        for (int i = 0; i < n; i++) {
            Node newNode = new Node(); // yahan pe banega har baar
            System.out.print("Enter " + (i + 1) + " Element: ");
            newNode.data = sc.nextInt();

            if (head == null) { // first node
                head = newNode;
                tail = newNode;
            } else { // last me add karo
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    void insertAtFirst(int val)
    {
        Node newNode=new Node();
        newNode.data=val;
        newNode.next=head;
        head=newNode;
    }
}

public class LinkedList5 {
    public static void main(String[] abc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        Node list = new Node();
        list.createList(n);
        list.printList();
        System.out.println();
        System.out.println("Enter value that you want to palce at first ");
        int val=sc.nextInt();
        list.insertAtFirst(val);
        list.printList();

        sc.close();
    }
}
