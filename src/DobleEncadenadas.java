/*

Referencias:
https://www.geeksforgeeks.org/insert-value-sorted-way-sorted-doubly-linked-list/
 */

public class DobleEncadenadas<E> extends StackVector<E> {

    Nodo head = null;
    Nodo tail = null;
    int size = 0;

    public DobleEncadenadas() {}

    @Override
    public int size()//para saber el tamaño del stack
    {
        return this.size();
    }

    @Override
    public boolean empty() //ver si el stack esta vacio o no
    {
        return (size == 0);
    }

    @Override
    public E peek() //para saber cual fue el ultimo elemento del stack
    {
        if(this.empty())
        {
            return null;
        }
        else
        {
            return (E) this.head.value; //regresa el ultimo elemento
        }
    }

    @Override
    public E  pop() //para sacar un elemento del stack
    {
        if(this.empty())
        {
            return null;
        }
        else
        {
            --this.size;
            E t = (E) this.head.value;
            this.head = this.head.next;//como se borra el valor de la cabeza se corre 1
            return t;
        }
    }

    @Override
    public void push(E num) //para ingresar un elemento al stack
    {
        this.tail=this.head; //la cola toma el valor de la cabeza (temporalmente)
        this.head= new Nodo(num,null,null);
        this.head.value=num;//en la cabeza se pone el valor obtenido
        this.head.next=this.tail;//el siguiente a la cabeza se ingresa el valor de la cola
        this.head.prev=null;//a la cola se le vuelve a meter 0
        if(this.tail !=null){ this.tail.prev=this.head;} // si la cabeza no esta vacia, al anterior a la cola se le pone el valor de la cabeza para el ordon

    }
}
