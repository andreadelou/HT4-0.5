//Referencia: https://www.geeksforgeeks.org/data-structures/linked-list/singly-linked-list/
//Referencia 2: Ejemplos cargados a Canvas.

public class SimplementeEncadenadas <E> extends StackVector<E>{
    
    //Creando nodos y variables.

    Nodo2 head = null; //Referencia al primer elemento.
    Nodo2<E> sorted = null; //Referencia para hacer arreglos en la lista.
    
    int val = 0;  //Tamaño de la lista.

    public SimplementeEncadenadas(){
    
        //this.val = val; 
    }

    @Override
    public E peek(){
        
        //Verificando el último elemento del LinkedList.

        //La lista no está vacía.
        return (E) head.valor();
         
    }

    @Override
    public boolean empty(){
        
        //Verificando si el Vector está vacío o no.

        return val == 0; 

         
    }

    @Override
    public int size(){
        
        //Tamaño que posee el Vector.
        
        return val; //Retornando el tamañano de la lista.
    }

    @Override
    public E pop(){
        
        //Se quitará el elemento del principio de la lista y también se retornará el mismo valor quitado.

        Nodo2<E> temp = head; //Creando una variable temporal.
        

        head = head.next(); //Se mueve la dirección de la lista. 

        val--; //El valor se reduce.

        return temp.valor(); //Retornando el valor de la variable temporal.
         
    }


    @Override
    public void push(E num){
        
        //Agregando el número al Vector.

        head = new Nodo2<E>(num, head);
        val++; //El tamaño de la lista aumenta.
    }
}
