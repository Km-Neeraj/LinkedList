
import java.util.Scanner;
class Node
{
                         int data;
                         Node next;
                         Node(int data)
                         {
                                                  this.data=data;
                                                  this.next=null;
                         }

}
public class LinkedList2 {
                         public static void main(String[]abc)
                         {
                                                  Scanner sc=new Scanner(System.in);
                                                  Node head=null;
                                                  Node tail=null;
                                                  System.out.println("Enter the number of elements ");
                                                  int n=sc.nextInt();
                                                  System.out.println("Enter Elements");
                                                  for(int i=0;i<n;i++)
                                                  {
                                                                           System.out.println("Enter "+(i+1)+" Element");
                                                                           int value=sc.nextInt();
                                                                           Node newNode=new Node(value);
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
                                                  System.out.println("Linked List Elements are ");
                                                  Node curr=head;
                                                  while(curr!=null)
                                                  {
                                                                           System.out.print(curr.data+" ");
                                                                           curr=curr.next;
                                                  }
                                                  sc.close();
                         }
                         
}
