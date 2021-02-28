/*

Referencias:
https://www.geeksforgeeks.org/insert-value-sorted-way-sorted-doubly-linked-list/
 */

public class DobleEncadenadas<E> extends StackVector<E> {

    Nodo head = null;
    Nodo tail = null;
    int size = 0;
    E value;
    Nodo next;
    Nodo prev;


    public DobleEncadenadas() {}

    /*
    public DobleEncadenadas( E value, Nodo next, Nodo prev)
    {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
    */

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
            size--;
            E t = (E) this.head.value;
            this.head = this.head.next;//como se borra el valor de la cabeza se corre 1
            if(this.head!=null) {
                this.head.prev = null;
            } else {
                this.tail = null;
            }

            return t;
        }
    }

    @Override
    public void push(E num) //para ingresar un elemento al stack
    {
        Nodo newNode = new Nodo(num, this.head, null);
        if(this.head !=null) {
            this.head.prev = newNode;
        } else {
            this.tail = newNode;
        }
        this.head = newNode;

        size++;
    }
}

