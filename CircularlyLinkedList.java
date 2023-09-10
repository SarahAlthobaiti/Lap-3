//Student Name: Sarah Mohammed Althobiti  Student ID: 444004881
public class CircularlyLinkedList<E>{
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(){}
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }
        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> n){
            next = n;
        }
    }
    private Node<E> tail = null;
    private int size = 0 ;
    public CircularlyLinkedList(){}
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public E first(){
        if(isEmpty()){
            return null;
        }
        return tail.getNext().getElement();
    }
    public E last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }
    public void rotate(){
        if(tail != null){
            tail = tail.getNext();
        }
    }
    public void traversal(){
        Node<E> c = tail.getNext();
        if (tail != null){
            do{
                System.out.print(c.getElement());
                c = c.getNext();
              
            }while(c != tail.getNext());
        }
    }
    public void addFirst(E e){
        if(isEmpty()){
            tail = new Node<E>(e,null);
            tail.setNext(tail);
        }else{
            Node<E> newest = new Node<>(e,tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }
    public void addLast(E e){
        addFirst(e);
        tail = tail.getNext();
    }
    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        Node<E> head = tail.getNext();
        if(head == tail){
            tail = null;
        }else{
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }

}