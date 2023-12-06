package one.dio;

public class DoublyLinkedNode<T> {
    
    private T content;
    private DoublyLinkedNode<T> nextNode;
    private DoublyLinkedNode<T> previousNode;
    
    public DoublyLinkedNode(T content){

    }
    public T getContent() {
        return content;
    }
    public void setContent(T content) {
        this.content = content;
    }
    public DoublyLinkedNode<T> getnextNode() {
        return nextNode;
    }
    public void setnextNode(DoublyLinkedNode<T> nextNode) {
        this.nextNode = nextNode;
    }
    public DoublyLinkedNode<T> getpreviousNode() {
        return previousNode;
    }
    public void setpreviousNode(DoublyLinkedNode<T> previousNode) {
        this.previousNode = previousNode;
    }
    

}
