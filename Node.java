class Node{
  private int item;
  private Node next;
 
 
  public Node(int item, Node next){
   this.item = item;
   this.next  = next;
  }
  
  public Node(int item){
   this(item, null);
  }
 
  public Node(){}
  
  //setters
  public void setItem(int item){
   this.item = item;
   }
  
  public void setNext(Node next){
   this.next = next;
  }
  
  //getters
  public int getItem(){
   return item;
  }
  
  public Node getNext(){
   return next;
  }
  

}