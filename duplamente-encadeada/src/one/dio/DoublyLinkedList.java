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
        DoublyLinkedNode<T> auxNode8 = firstNode;

        for(int i = 0; (i<index) && auxNode8!= null; i++){
            auxNode8= auxNode8.getnextNode();
        }
        return auxNode8;
    }

    public T get(int index){
        return this.getNode(index).getContent();
    }
     
    public void add(T element){
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<T>(element);
        newNode.setContent(element);
        newNode.setnextNode(null);
        newNode.setpreviousNode(lastNode);
        if(firstNode == null){
            firstNode=newNode;}
        if(lastNode != null){
            lastNode.setnextNode(newNode);
        }
            lastNode = newNode;
            listSize++;
    }

        public void addIndex(int index, T element){

            DoublyLinkedNode<T> newNode = new DoublyLinkedNode<T>(element);
            newNode.setContent(element);
            DoublyLinkedNode<T> auxNode7 = getNode(index);
            newNode.setnextNode(auxNode7);
               
            if (newNode.getnextNode()!= null){
                newNode.setpreviousNode(auxNode7.getpreviousNode());
                newNode.getnextNode().setpreviousNode(newNode);
            }else{
                newNode.setpreviousNode(lastNode);
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
                DoublyLinkedNode<T> auxNode2 = getNode(index);
                auxNode2.getpreviousNode().setnextNode(auxNode2.getnextNode());
                if(auxNode2 != lastNode){
                auxNode2.getnextNode().setpreviousNode(auxNode2.getpreviousNode());
                }else{
                    auxNode2 = lastNode;
                }
            }
            listSize--;
        }
        
        @Override
        public String toString(){
                String strRetorno = "";
                DoublyLinkedNode<T> auxNode3 = firstNode;
                for(int i = 0; i < size(); i++){
                    strRetorno += "[No{conteudo=" +auxNode3.getContent() +"}]--->";
                   auxNode3 =auxNode3.getnextNode();
                }
                strRetorno += "null";
                return strRetorno;
        }

}
