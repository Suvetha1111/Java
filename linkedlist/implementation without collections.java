import java.lang.classfile.components.ClassPrinter;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public void insertend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void insertstart(int data)
    {
        Node newNode=new Node(data);
        if (head == null) {
            head = newNode;
        } else {
          newNode.next=head;
          head=newNode;
    }
    }
    public void insertatany(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 2; i++) //if index is respect to user view index-2 else index-1
            {
                if (current != null) {
                    current = current.next;
                } else {
                    throw new IndexOutOfBoundsException("Index out of bounds");
                }
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
public void deleteat(int index)
{
if(index==0)
 head=head.next;
else{
    Node n=head;
    Node n1=null;
for(int i=0;i<index-2;i++)
{
n=n.next;
}
n1=n.next;
n.next=n1.next;
System.out.println("deleted:"+n1.data);
}
}    

    public void show() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class R {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc=new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("1 = Insert at end\n2 = Insert at start\n 3=Insert at any loc\n 4= Delete at any\n5= PRINT\nPress 0 to stop");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter data:");
                    int data=sc.nextInt();
                    list.insertend(data);
                    break;
              case 2:
                    System.out.println("Enter data:");
                    int d=sc.nextInt();
                     list.insertstart(d);
                     break;
              case 3:
               System.out.println("Enter index:");
               int i=sc.nextInt();
               System.out.println("Enter data:");
               int da=sc.nextInt();
               list.insertatany(i,da);
               break;
               case 4:
               System.out.println("Enter index:");
               int in=sc.nextInt();
                list.deleteat(in);
               break;
               case 5:
              list.show();  
              break;
              case 0:
        System.out.println("Exiting...");
        break;
        default:
        System.out.println("Invalid choice");
        break;
        
    }
        }
}
}
