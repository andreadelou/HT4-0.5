import java.util.ArrayList;

public class StackList<E> extends List<E>{

    public ArrayList<E> a;
    int size;

    public StackList()
    {
        this.a=new ArrayList<E>();
    }

    @Override
    public void push(E num) {
        a.add(num);
        size++;
    }

    @Override
    public E pop() {
        if(a.isEmpty())
        {
            return null;
        }
        else
        {
            int temp = a.indexOf(a.get(a.size() - 1));
            E value = a.get(temp);
            a.remove(value);
            size--;
            return value;
        }
    }

    @Override
    public E peek() {
        if(a.isEmpty())
        {
            return null;
        }
        else{
            int temp=a.indexOf(a.get(0));
            return a.get(temp);
        }
    }

    @Override
    public void addF(E num) {

    }

    @Override
    public void addL(E num) {

    }

    @Override
    public E delF() {
        return null;
    }

    @Override
    public E delL() {
        return null;
    }

    @Override
    public boolean empty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return a.size();
    }


}
