public class LinkedList{
   Node head;
   Node tail;
   int count;
 
 //determine whether the list is empty
   public boolean isEmpty(){
      return count == 0;
   }
 
   public String toString(){
      StringBuffer sb = new StringBuffer();
      sb.append("{");
      Node p = head;
      while(p != null){
         sb.append(p.getItem() + " ");
         p = p.getNext();
      }
      sb.append("}");
      return sb.toString();
   }
 
   public void addFirst(int item){
      Node temp = new Node(item,head);
      if(isEmpty())
         tail = head = temp;
      else
         head = temp;
      count++;
   }
 
   public void addLast(int item){
      if(isEmpty())
         addFirst(item);
      else{
         Node newNode = new Node(item);
         tail.setNext(newNode);
         tail = newNode;
         count++;
      }
   }
 //output the list - ok
 //find the length of the list
   public int Count() {
      return count;
   }
 //retrieve the item contained in the first node
   public int getFirstElement(){
      if(!isEmpty())
         return head.getItem();
      return 0;
   }
 //retrieve the item contained in the last node
   public int getLastElement(){
      if(!isEmpty())
         return tail.getItem();
      return 0;
   }
 //search the list for a given item
   public boolean isFound(int item){
      boolean check = false;
      Node p = head;
      while(p != null) {
         if(p.getItem() == item){
            check = true;
            break;
         }
         p = p.getNext();
      }
      return check;
   }
  //delete an item from the list
   public void remove(int item) {
      Node p = head;
      Node prev = null;
      while(p != null) {
         if(p.getItem() == item) {
            if(prev == null)
               head = p.getNext();
            else 
               prev.setNext(p.getNext());
            count--;
         } 
         else 
            prev = p;
         p = p.getNext();
         tail = prev;
      }
   } 

   public int getSum(){
      int sum = 0;
      Node p = head;
      while(p!= null){
         sum = sum + p.getItem();
         p = p.getNext();
      }
      return sum;
   }

   public int getSmallest(){
      int smallest = 0;
      Node p = head;
      if(!isEmpty()) {
         smallest = p.getItem();
         while(p != null) {
            if(smallest > p.getItem())
               smallest = p.getItem();
            p = p.getNext(); 
         }
      }
      return smallest;
   }
   public int getLargest(){
      int largest = 0;
      Node p = head;
      if(!isEmpty()) {
         largest = p.getItem();
         while(p != null) {
            if(largest < p.getItem())
               largest = p.getItem();
            p = p.getNext();
         }
      }
      return largest; 
   }
   public int sumOfEven(){
      int sum = 0;
      Node p = head;
      while(p != null) {
         if(p.getItem() % 2 == 0)
            sum += p.getItem();
         p = p.getNext();
      }
      return sum; 
   } 
   public void doubleTheElement(){
      Node p = head;
      int dElement;
      while(p!=null){ 
         dElement = p.getItem () * 2;
         p.setItem(dElement);
         p = p.getNext();
      }
   }
 
   public static void main(String [] args){
      LinkedList list = new LinkedList();
      list.addFirst(5);
      list.addFirst(6);
      list.addFirst(6);
      list.addLast(8);
      //list.remove(8);
      //list.doubleTheElement();
      System.out.println("list contains: " + list);
      System.out.println("The Element is found?: " + list.isFound(1));
      System.out.println("Length of the Array: "+ list.Count());
      System.out.println("The first element is:  " + list.getFirstElement());
      System.out.println("The last element is:  " + list.getLastElement());
      System.out.println("Sum: " + list.getSum());
      System.out.println("Smallest: " + list.getSmallest());
      System.out.println("Largest: " + list.getLargest());
      System.out.print("Sum of Even Numbers: " + list.sumOfEven());
   }
}
