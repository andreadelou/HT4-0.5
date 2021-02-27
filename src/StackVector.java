/*
Andrea Lam, 20102

Clase en la cual se realiza las acciones del Stack

Referencias:
https://stackoverflow.com/questions/56615055/how-do-i-implement-the-push-pop-peek-methods-for-an-inverse-array

*/


import java.util.Vector;

public abstract class StackVector<E> implements Stack<E> {

    public Vector<E> data;

    @Override
    public boolean empty()//verificar si el stack esta vacio
    {
        return data.isEmpty();
    }

}
