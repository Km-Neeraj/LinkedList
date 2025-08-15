import java.util.Scanner;
class Node{
                         int data;
                         Node next;
                         Node(int data)
                         {
                                                  this.data=data;
                                                  this.next=null;
                         }
}
public class LinkedList3 {
                         public static void main(String[]abc)
                         {
                             Node head=null;
                             Node tail=null;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter the number of elements ");
                             int n=sc.nextInt();

                             System.out.println("Enter Elements-----------");
                             for(int i=0;i<n;i++)
                             {
                               System.out.print("Enter "+(i+1)+" Element: ");
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

                             System.out.println("Elements are-----------");
                             Node curr=head;
                             while(curr!=null)
                             {
                                 System.out.print(curr.data+" ");
                                 curr=curr.next;                 
                             }
                             sc.close();
                         }
                         
}
