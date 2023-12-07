package one.dio;

public class DoublyLinkedList<T> {
    
    private DoublyLinkedNode<T> firstNode;
    private DoublyLinkedNode<T> lastNode;

    private int listSize;

    public DoublyLinkedList(){
        this.listSize = 0;
        this.firstNode = null;
        this.lastNode = null;
    }

    public int size(){
        return listSize;
    }

    private DoublyLinkedNode<T> getNode(int index){
        DoublyLinkedNode<T> auxNode = firstNode;

        for(int i = 0; (i<index) && auxNode!= null; i++){
            auxNode= auxNode.getnextNode();
        }
        return auxNode;
    }

    public T get(int index){
        return this.getNode(index).getContent();
    }
     
    public void add(T element){
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<>(element);
            firstNode.setnextNode(null);

        if(firstNode.equals(null)){
            firstNode.setnextNode(newNode);
            lastNode.setpreviousNode(newNode);
        }

    }
}
