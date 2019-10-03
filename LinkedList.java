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
      if (index==0)
      {
         System.out.println(head.data);
      }
      else
      {
          ListElement temp=head;
          for(int i=0; i < index-1; i++)
          {
            temp = temp.next;
          }
          System.out.println(temp.data);
      }
  }

  public ListElement deleteElement(int index)
  {

      if(index ==0)
      {
         this.head = this.head.next;
      }
      else
      {
        ListElement temp= head;
        ListElement temp1= null;

        for(int i=0; i<index-1; i++)
        {
          temp = temp.next;
        }
        temp1 = temp.next;
        temp.next = temp1.next;
        //System.out.println(temp1.data);

      }
  }

  public void printLinkedListHead()
  {
      ListElement temp = this.head;
      temp.data =data;
      while(temp.next!=null)
      {
        System.out.println(temp.data);
        temp= temp.next;
      }
      System.out.println(temp.data);
  }


}
