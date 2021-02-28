import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main( String[] args){

        Calculadora calculadora = new Calculadora();
        Convertir con=new Convertir();
        //Scanner scan = new Scanner(file); //Duda.
        String expresion = "";
        Scanner scan = new Scanner(System.in); //Instanciando la clase Scanner.
        int op;

        try {
            File file = new File("datos.txt"); //busca el archivo llamado datos
            Scanner scan2 = new Scanner(file);
            while(scan2.hasNextLine() ){  //mientras tenga una siguiente linea el archivo  //scan2.hasNextLine()
                try {
                    String a = scan2.nextLine(); //lee la linea
                    System.out.print("La expresión es: "+a); //muestra la expresión
                    //Convertir infix a posfix
                    System.out.println("\n");
                    expresion = con.PosFix(a); //se envia la expresión
                    System.out.print("Con posfix  es: "+expresion);
                    System.out.println("\n");

                    while(true){
                        try{
                            System.out.print("Desea almacenar en 1. simplemente encadenadas o 2. doblemente encadenadas 3.Vector 4.Listas : ");
                            op = scan.nextInt();
                            System.out.println("\n");
                            if(op>4 && op<1){
                                //Si el usuario ingresa los datos correctos terminará el ciclo while.
                            }else{break;}
                        }
                        //Si el usuario ingresa una letra regresará un mensaje de error.
                        catch(Exception o){
                            scan.nextLine();
                            System.out.println("Caracter invalido! Intenta de nuevo..");
                        }
                    }
                    ////
                    if(op==1)
                    {
                        //Lista simplemente encadenada.
                        String b = calculadora.CalculoSE(expresion);
                        System.out.println("El resultado es: "+ b);

                    }else if(op==2) {
                        //Listas doblemente encadenadas.

                        String b = calculadora.CalculoDE(expresion);
                        System.out.println("El resultado es: "+ b);
                    }
                    else if(op==3) {
                        //Vcetor.

                        String b = calculadora.CalculoV(expresion);
                        System.out.println("El resultado es: "+ b);
                    }
                    else if(op==4) {
                        //Listas.

                        String b =calculadora.CalculoL(expresion);
                        System.out.println("El resultado es: "+ b);
                    }

                    else
                    {
                        System.out.println("Ha elegido una opción no válida.");
                    }









                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e){
            System.out.println("No se encontro el archivo");
        }


    }
}