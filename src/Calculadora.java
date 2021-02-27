import java.util.ArrayList;
import java.util.Arrays;

public class Calculadora {

    //public Stack<Integer> stack;
    DobleEncadenadas DE = new DobleEncadenadas();
    public String numeros=("0123456789");

    //SimplementeEncadenadas
    public String CalculoSE(String a)
    {
        
        StackVector<E> stack = new StackVector<E>();

        try
        {
            for (int i=0; i<a.length(); i++)
            {
                char caracter = a.charAt(i);//obtiene el caracter

                //comparar si es un numero o un operador
                if(numeros.contains(String.valueOf(caracter))) //si es un numero
                {
                    stack.push(Character.getNumericValue(caracter)); //se guarda en el stack

                    Nodo primer = new Nodo(Character.getNumericValue(caracter)); //Instanciando con el caracter que se colocará en la lista.



                }
                else
                {
                    if(!stack.empty())
                    {
                        int num1=stack.pop();
                        int num2=stack.pop();

                        switch (caracter)
                        {
                            case '+':
                                //stack.pop();
                                stack.push(num1 + num2);
                                SE segundo = new SE(num1 + num2); //Haciendo el nodo con la suma.
                                primer.enlazarSiguiente(segundo);
                                break;
                            case '-':
                                //stack.pop();
                                stack.push(num1 - num2);

                                SE tercero = new SE(num1 - num2); //Haciendo el nodo con la resta.
                                primer.obtenerSiguiente().enlazarSiguiente(tercero); //Enlazando al tercer nodo con el primero y el segundo.
                                break;
                            case '*':
                                //stack.pop();
                                stack.push(num1 * num2);
                                SE cuarto = new SE(num1 * num2); //Creando un cuarto nodo.
                                primer.obtenerSiguiente().enlazarSiguiente(cuarto); //Enlazando el primer nodo, con el segundo y con el tercero.
                                break;
                            case '/':
                                //stack.pop();
                                stack.push(num1 / num2);
                                break;
                            SE quinto = new SE(num1/num2); //Creando un quinto nodo
                            primer.obtenerSiguiente().enlazarSiguiente(quinto); //Enlazando el primer nodo, con el segundo, con el tercero y con el cuarto.
                            default:
                                System.out.println("A ocurrido un error en el ingreso de datos");
                                System.out.println("Porfavor no divida dentro de 0");

                        }
                    }
                }
            }

        }catch (Exception e)
        {
            System.out.println("No se pudo realizar el calulo por error: "+ e);
        }


        String resultado= String.valueOf(stack.peek()) ;
        return resultado;


    }


    //DobleEncadenadas
    public String CalculoDE(String a)
    {
        DobleEncadenadas<Integer> DE =new DobleEncadenadas<Integer>();

        try
        {
            for (int i=0; i<a.length(); i++)
            {
                char caracter = a.charAt(i);//obtiene el caracter

                //comparar si es un numero o un operador
                if(numeros.contains(String.valueOf(caracter))) //si es un numero
                {
                    DE.push(Character.getNumericValue(caracter)); //se guarda en el stack

                }
                else
                {
                    if(!DE.empty())
                    {
                        int num1=DE.pop();
                        int num2=DE.pop();

                        switch (caracter)
                        {
                            case '+':
                                //stack.pop();
                                DE.push(num1 + num2);
                                break;
                            case '-':
                                //stack.pop();
                                DE.push(num1 - num2);
                                break;
                            case '*':
                                //stack.pop();
                                DE.push(num1 * num2);
                                break;
                            case '/':
                                //stack.pop();
                                DE.push(num1 / num2);
                                break;
                            default:
                                System.out.println("A ocurrido un error en el ingreso de datos");
                                System.out.println("Porfavor no divida dentro de 0");

                        }
                    }
                }
            }

        }catch (Exception e)
        {
            System.out.println("No se pudo realizar el calulo por error: "+ e);
        }

        String resultado= String.valueOf(DE.peek()) ;
        return resultado;
    }

    public String CalculoV(String a)
    {
        Sstack<Integer> stack = new Sstack<Integer>();

        try
        {
            for (int i=0; i<a.length(); i++)
            {
                char caracter = a.charAt(i);//obtiene el caracter

                //comparar si es un numero o un operador
                if(numeros.contains(String.valueOf(caracter))) //si es un numero
                {
                    stack.push(Character.getNumericValue(caracter)); //se guarda en el stack

                }
                else
                {
                    if(!stack.empty())
                    {
                        int num1=stack.pop();
                        int num2=stack.pop();

                        switch (caracter)
                        {
                            case '+':
                                //stack.pop();
                                stack.push(num1 + num2);
                                break;
                            case '-':
                                //stack.pop();
                                stack.push(num1 - num2);
                                break;
                            case '*':
                                //stack.pop();
                                stack.push(num1 * num2);
                                break;
                            case '/':
                                //stack.pop();
                                stack.push(num1 / num2);
                                break;
                            default:
                                System.out.println("A ocurrido un error en el ingreso de datos");
                                System.out.println("Porfavor no divida dentro de 0");

                        }
                    }
                }
            }

        }catch (Exception e)
        {
            System.out.println("No se pudo realizar el calulo por error: "+ e);
        }

        String resultado= String.valueOf(stack.peek()) ;
        return resultado;
    }

    public String CalculoL(String a)
    {
        StackList<Integer> List =new StackList<Integer>();
        try
        {
            for (int i=0; i<a.length(); i++)
            {
                char caracter = a.charAt(i);//obtiene el caracter

                //comparar si es un numero o un operador
                if(numeros.contains(String.valueOf(caracter))) //si es un numero
                {
                    List.push(Character.getNumericValue(caracter)); //se guarda en el stack

                }
                else
                {
                    if(!List.empty())
                    {
                        int num1=List.pop();
                        int num2=List.pop();

                        switch (caracter)
                        {
                            case '+':
                                //stack.pop();
                                List.push(num1 + num2);
                                break;
                            case '-':
                                //stack.pop();
                                List.push(num1 - num2);
                                break;
                            case '*':
                                //stack.pop();
                                List.push(num1 * num2);
                                break;
                            case '/':
                                //stack.pop();
                                List.push(num1 / num2);
                                break;
                            default:
                                System.out.println("A ocurrido un error en el ingreso de datos");
                                System.out.println("Porfavor no divida dentro de 0");

                        }
                    }
                }
            }

        }catch (Exception e)
        {
            System.out.println("No se pudo realizar el calulo por error: "+ e);
        }

        String resultado= String.valueOf(List.peek()) ;
        return resultado;
    }



}