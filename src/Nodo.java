/*

Referencias:
https://www.geeksforgeeks.org/doubly-linked-list/
https://www.tutorialspoint.com/data_structures_algorithms/doubly_linked_list_algorithm.htm
 */

public class Nodo<E> {

    public E value;
    public Nodo<E> next;
    public Nodo<E> prev;

    public Nodo(E value, Nodo next, Nodo prev) {
        this.next = null;
        this.prev = null;
        this.value = value;
    }

    public E Value() {
        return value;
    }

    public E getValue() {
        return this.value;
    }

    public void setValue(E data) {
        this.value= data;
    }

    public Nodo getNext() {
        return this.next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrev() {
        return this.prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

}
