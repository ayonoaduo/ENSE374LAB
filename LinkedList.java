public class LinkedList{

  private ListElement head;

  public LinkedList()
  {
    this.head == null;
  }
  public void addElement(ListElement le)
  {
    le.next=null;
    if(this.head==null)
    {
      this.head = le;
    }
    else{
      ListElement temp= this.head;
      while(temp.next!=null)
      {
         temp = temp.next;
      }
      temp.next=le;

    }

  }
  public ListElement getElement(int index)
  {

  }

  public ListElement deleteElement(int index)
  {

  }

  public void printLinkedListHead()
  {

  }


}
