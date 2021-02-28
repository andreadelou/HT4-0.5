public abstract class List <E>{
    // declare fields
   // declare nonabstract methods
   abstract public void addF(E num);//para ingresar un elemento de primero al LinkedList
   abstract public void addL(E num);//para ingresar un elemento de último al LinkedList. 
   abstract public E  delF(); //para sacar un elemento de primero del LinkedList.
   abstract public E delL();  //para sacar un elemento de último en el LinkedList.
   abstract public boolean empty(); //ver si el stack esta vacio o no
   abstract public int size();//para saber el tamaño del stack.
   abstract public E peek(); //Obteniendo el primer o último valor del LinkedList.
   abstract public void push(E num);
   abstract public E pop();



}