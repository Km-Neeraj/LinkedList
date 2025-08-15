import java.util.*;
class Node{
            int data;
            Node next;
            Node head=null;
            void createList(int n)
            {
                 Scanner sc=new Scanner(System.in);
                 Node tail=null;
                 System.out.println("Enter Elements-------");
                 for(int i=0;i<n;i++)
                 {
                     Node newNode=new Node();
                     
                     System.out.print("Enter "+(i+1)+" Element: ");
                     int val=sc.nextInt();
                     newNode.data=val;
                     if(head==null)
                     {
                         head=newNode;
                         tail=newNode;
                     }
                     else{
                         tail.next=newNode;
                         tail=newNode;
                     }
                 }

            }
            void printList()
            {
               Node temp=head;
               while(temp!=null)
               {
                   System.out.print(temp.data+" ");
                   temp=temp.next;
               }
            }
            void insertLast(int val)
            {
               Node temp=head;
               Node newNode=new Node();
               newNode.data=val;
               while(temp.next!=null)
               {
                         temp=temp.next;
               }
               temp.next=newNode;
               
            }
}
public class LinkedList6 {
                         public static void main(String[]abc)
                         {
                              Node list=new Node();
                              Scanner sc=new Scanner(System.in);
                              System.out.println("Enter the number of elements ");
                              int n=sc.nextInt();
                              list.createList(n);
                              list.printList();
                              System.out.println();
                              System.out.println("Enter value to place at last");
                              int val1=sc.nextInt();
                              list.insertLast(val1);
                              list.printList();
                              sc.close();
                         }
                         
}
