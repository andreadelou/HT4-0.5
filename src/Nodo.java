/*

Referencias:
https://www.geeksforgeeks.org/doubly-linked-list/
https://www.tutorialspoint.com/data_structures_algorithms/doubly_linked_list_algorithm.htm
 */

public class Nodo<E> {

    public E value;
    public Nodo<E> next;
    public Nodo<E> prev;

    public Nodo(E value) {
        this.value = value;
    }

    public Nodo(E data, Nodo next, Nodo prev) {
        this.value = data;
        this.next = next;
        this.prev = prev;
    }




}
