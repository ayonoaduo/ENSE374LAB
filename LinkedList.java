//import java.util.Scanner;

public class LinkedList{

  private ListElement head=null;
  private ListElement prev=null;

  //Function to add elements to Linked list
  public void addElement(ListElement le)
  {
    ListElement temp = head;

    if(head==null)
    {
      head = le;
      return;
    }
    while(temp.getNext()!=null)//while next is not null, traverse through linked list
      {
         temp=temp.getNext();
      }
      temp.setNext(le);
    }

  public int getElement(int index)
  {
      int currentindex=0;
      ListElement temp=head;
      if (index==0 && head!= null)//if index is 0 and head is not null, display head node
      {
         return head.getData();
      }
      while(currentindex < index)//traversing through linked list
      {
        if(temp.getNext() != null)//keep traversing
    		{
    			currentindex++;
    			temp = temp.getNext();
    		}
        else{
          System.out.println("Index out of bounds!");
          return 0;
        }
      }
      return temp.getData();
  }

  public void deleteElement(int index)
  {
      int currentindex=0;
      ListElement temp= head;
      ListElement temp1 = null;//to keep track of node before
      if(head == null)//check to see if head is null
    	{
    		System.out.println("Empty list");
    		return;
    	}

    	if(index == 0)//if index is 0, set head to next
    	{
    		head = head.getNext();
        System.out.println("Node " +index+ "Deleted successfully");
    		return;
    	}
      while(currentindex < index)
      {
        if(temp.getNext() != null)
        {
          currentindex++;
          temp1 = temp;
          temp = temp.getNext();
        }
        else
        {
          System.out.println("Index out of bounds");
          return;
        }
      }
      temp1.setNext(temp.getNext());
      System.out.println("Node " +index+ " Deleted successfully");
      return;

      }

  public void printLinkedListHead()
  {
      ListElement temp = head;
      if(head==null)
      {
        System.out.println("Linked list is empty");
      }

      while(temp.getNext()!=null)
      {
        System.out.println(temp.getData());
        temp = temp.getNext();
      }
      System.out.println(temp.getData());
  }

  public static void main(String [] args)
  {
      ListElement le = new ListElement();
      le.setData(5);

      ListElement le1 = new ListElement();
      le1.setData(6);

      ListElement le2 = new ListElement();
      le2.setData(7);

      LinkedList ll = new LinkedList();
      ll.addElement(le);
      ll.addElement(le1);
      ll.addElement(le2);

      ll.printLinkedListHead();

      ll.getElement(1);
      ll.getElement(2);

      ll.deleteElement(2);

      ll.printLinkedListHead();
  }
}
