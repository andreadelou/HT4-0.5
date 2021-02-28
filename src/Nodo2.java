/* 

Referencia: 1. https://www.geeksforgeeks.org/linked-list-set-1-introduction/
Referencia2: Ejemplos cargados a CANVAS.

*/              

public class Nodo2<E> {
        
        E data; //Objeto que almacena valores.
        int dat; //Variable de tipo entero para los números y punteros. 
        Nodo2<E> head; //Cabeza del nodo.
        Nodo2<E> nextE; //Siguente posición del nodo. Hace referencia también.


        public Nodo2(E v, Nodo2<E> next){
            //Constructor.


            //Asignando valores.
            data = v;

            nextE = next;
        }

        public Nodo2<E> next(){

            //Se retorna el siguiente elemento que hay en la lista creada.

            return nextE; 
        }

        public void setNext(Nodo2<E> next){
            //Da referencia a un nuevo valor.

            nextE = next; 
        }

        public E valor(){
            //Se hacer referencia al valor del elemento al que se está apuntando.
        
            return data; 
        }

        public void setValor(E value){
            //Le asigna valor a un nuevo elemento.

            data = value; 
        }
}