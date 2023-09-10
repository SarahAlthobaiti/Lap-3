//Student Name: Sarah Mohammed Althobiti  Student ID: 444004881
public class main{
 public static void main(String[] args) {
    CircularlyLinkedList<Integer> myList = new CircularlyLinkedList<>();
    myList.addFirst(1);
    myList.addLast(2);
    myList.addFirst(0);
    myList.addLast(3);
    myList.traversal();
    System.out.println();
    System.out.println("the first element is: "+myList.first());
    System.out.println("the last element is: "+myList.last());
    System.out.println("the size is: "+myList.size());
    myList.removeFirst();
    myList.traversal();
    System.out.println();
    System.out.println("the first element is: "+myList.first());
    System.out.println("the last element is: "+myList.last());
    System.out.println("the size is: "+myList.size());


  } 
}