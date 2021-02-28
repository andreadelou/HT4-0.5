import java.util.ArrayList;
import java.util.Arrays;

public class Calculadora {

    //public Stack<Integer> stack;
    DobleEncadenadas DE = new DobleEncadenadas();
    public String numeros=("0123456789");

    //SimplementeEncadenadas
    public String CalculoSE(String a)
    {
        SimplementeEncadenadas<Integer> SE = new SimplementeEncadenadas<Integer>();
        try
        {
            for (int i=0; i<a.length(); i++)
            {
                char caracter = a.charAt(i);//obtiene el caracter

                //comparar si es un numero o un operador
                if(numeros.contains(String.valueOf(caracter))) //si es un numero
                {
                    //stack.push(Character.getNumericValue(caracter)); //se guarda en el stack
                    SE.push(Character.getNumericValue(caracter)); //Haciendo push del caracter a la lista simplemente encadenada.

                }
                else
                {
                    if(!SE.empty())
                    {
                        int num1= (int) SE.pop();
                        int num2= (int) SE.pop();

                        switch (caracter)
                        {
                            case '+':
                                //stack.pop();
                                //stack.push(num1 + num2);
                                SE.push(num1 + num2); //Haciendo el nodo con la suma.
                                break;
                            case '-':
                                //stack.pop();
                                //stack.push(num1 - num2);
                                SE.push(num1 - num2); //Haciendo el nodo con la resta.
                                break;
                            case '*':
                                //stack.pop();
                                //stack.push(num1 * num2);
                                SE.push(num1 * num2);
                                break;
                            case '/':
                                //stack.pop();
                                //stack.push(num1 / num2);
                                SE.push(num1/num2);
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


        String resultado= String.valueOf(SE.peek());
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