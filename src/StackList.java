import java.util.ArrayList;

public class StackList<E> extends StackVector<E>{

    public ArrayList<E> a;

    public StackList()
    {
        this.a=new ArrayList<E>();
    }

    @Override
    public void push(E num) {
        a.add(num);
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
    public int size() {
        return a.size();
    }


}
