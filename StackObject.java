public class StackObject<T> implements Stack<T>{
    private Node<T> first; // referência para o topo da pilha

    // casinha
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void push(T data){
        Node<T> aux = new Node<>(data);
        // se a fila estiver vazia
        if (isEmpty()) {
            first = aux;
        } else {
            aux.next = first;
            first = aux;
        }
    }
    
    public T pop(){
        Node<T> aux; // etiqueta auxiliar
        T data;
        if (isEmpty()) { // não pode desenfileirar! erro!
            throw new IndexOutOfBoundsException("Fila vazia! Impossível desenfileirar!");
        }

        aux = first;  // etiqueta auxiliar aponta para o primeiro nó
        first = aux.next; // primeiro aponta para o segundo
        aux.next = null; // desconecto o auxiliar da fila
        data = aux.data;

        return data;

    }

    // boolean isEmpty();
    // se o topo for null é vazio
    public boolean isEmpty() {
        return (first == null);
    }

}
