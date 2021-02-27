import java.util.Vector;

public class Convertir {

    private static int jerarquia(char c)
    {
        switch(c)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public String PosFix(String ex)
    {
        String resultado="";

        Sstack<Character> stack=new Sstack<>();
        for(int i=0;i<ex.length();i++)
        {
            char c= ex.charAt(i);
            if(c=='(' )
            {
                stack.push(c);
            }
            else if(c==')')//si termina el corchete agarra todos los anteriores
            {
                while (!stack.empty() &&
                        stack.peek() != '(')
                    resultado+= stack.pop();

                stack.pop();
            }
            else if(Character.isLetterOrDigit(c))//es un digito
            {
                resultado+=c;
            }
            else //operador
            {
                while (!stack.empty() && jerarquia(c)
                        <= jerarquia(stack.peek())){

                    resultado += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.empty()){
            if(stack.peek() == '(')
                return "Expresion invalida";
            resultado += stack.pop();
        }

        return resultado;
    }
}
