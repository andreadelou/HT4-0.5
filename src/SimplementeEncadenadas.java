//Referencia: https://www.geeksforgeeks.org/data-structures/linked-list/singly-linked-list/

public class SimplementeEncadenadas <E> extends StackVector<E>{
    
    //Creando nodos y variables.

    Nodo head = null;
    Nodo sorted = null;
    
    int val = 0; 

    public SimplementeEncadenadas(){
    
        //this.val = val; 
    }

    @Override
    public E peek(){
        
        //Verificando el último elemento del LinkedList.

        if(head == null){ //Si el nodo está vacío, entonces no se regresa nada.
            
            System.out.println("Vacío");
            return null;
        }

        else{

            this.head = head.next; //Leyendo el valor que posee el nodo.

            return (E) this.head.toString(); //Retornando el nodo sorted.
        }

         
    }

    @Override
    public boolean empty(){
        
        //Verificando si el Vector está vacío o no.

        return val == 0; 

         
    }

    @Override
    public int size(){
        
        //Tamaño que posee el Vector.
        
        return this.size(); //Retornando el tamañano del Vector.
    }

    @Override
    public E pop(){
        
        //Sacar un elemento de la lista y eliminarlo.
 

        if(head == null){//Si la lista está vacía. entonces se retorna un valor nulo.
           
            return null; //No se regresa nada, porque está vacío. 
        
        }else{ //Se busca el elemento a buscar y se elimina. 



            E sorted = (E) head; //Obteniendo el nodo al cual se el hará pop.

            head = head.next; //Apuntando a nuevo elemento que será el que encabeza el Linked List

            return sorted; //Retornando el elemento a eliminar.   
        }

         
    }


    @Override
    public void push(E num){
        
        //Agregando el número al Vector.

        Nodo h = new Nodo(num, null, null); //Asignando a la instancia el valor a introducir a la lista.
        h.next = head; //Conectando el último valor antigüo con el nuevo asignado a la lista.

        head = h; //Moviendo el puntero al nuevo nodo.
    }
}
