public class ListTester {
  public static void main(String[] args){
      SinglyLinkedList list = new SinglyLinkedList();
       list.add(3);
        list.add(4);
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(2);
        list.remove();
        list.remove();
        list.printValues();
  }
}