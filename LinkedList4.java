
import java.util.*;
class Node{
                         int data;
                         Node next;
                         Node head=null;
                         void insertAtFirst(int value)
                         {
                            
                            Node newNode=new Node();
                            newNode.data=value;
                            newNode.next=head;
                            head=newNode;

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
}
public class LinkedList4 {
                         public static void main(String[]abc)
                         {
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter Number of elements ");
                             int n=sc.nextInt();
                             Node list=new Node();
                             for(int i=0;i<n;i++)
                             {
                                System.out.print("Enter "+(i+1)+" Element: ");
                                int val=sc.nextInt();
                                list.insertAtFirst(val);

                             }
                             list.printList();
                             sc.close();
                         }
                         
}
