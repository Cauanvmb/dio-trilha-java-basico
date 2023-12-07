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
        newNode.setnextNode(null);
        newNode.setpreviousNode(lastNode);
        if(firstNode == null){
            firstNode=newNode;
        if(lastNode != null)
            lastNode.setnextNode(newNode);
        }
            lastNode = newNode;
            listSize++;
    }

        public void add(int index, T element){

            DoublyLinkedNode<T> newNode = new DoublyLinkedNode<>(element);
            DoublyLinkedNode<T> auxNode = getNode(index);
            newNode.setnextNode(auxNode);
               
            if (newNode.getnextNode()!= null){
                newNode.setpreviousNode(auxNode.getpreviousNode());
                newNode.getnextNode().setpreviousNode(newNode);
            }else{
                lastNode = newNode;
            }            
            if(index == 0){
                firstNode = newNode;
            }else{
                newNode.getpreviousNode().setnextNode(newNode);
            }

            listSize++;
        }

        public void remove(int index){
            if(index == 0){
                firstNode = firstNode.getnextNode();
                if(firstNode!=null){
                    firstNode.setpreviousNode(null);
                }
            }else{
                DoublyLinkedNode<T> auxNode = getNode(index);
                auxNode.getpreviousNode().setnextNode(auxNode.getnextNode());
                if(auxNode != lastNode){
                auxNode.getnextNode().setpreviousNode(auxNode.getpreviousNode());
                }else{
                    auxNode = lastNode;
                }
            }
            listSize--;
        }

}
