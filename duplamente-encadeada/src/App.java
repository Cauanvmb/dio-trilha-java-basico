import one.dio.DoublyLinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList<Integer> lista = new DoublyLinkedList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.addIndex(2, 69);

        System.out.println(lista);
        System.out.println(lista.size());
        lista.remove(1);
        System.out.println(lista);
        System.out.println(lista.size());

    }
}
