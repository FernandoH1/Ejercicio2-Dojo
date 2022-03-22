package co.com.sofka.App;

import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        System.out.println("Bienvenido, Chat sofka");
        System.out.println("Por favor introduzca su mensaje: ");

        Scanner entrada = new Scanner(System.in);
        String mensaje = entrada.nextLine();

        ArrayList<String> listaNegra = new ArrayList<String>();
        listaNegra.add("MalaPalabra1");
        listaNegra.add("MalaPalabra2");
        listaNegra.add("MalaPalabra3");
        listaNegra.add("MalaPalabra4");
        listaNegra.add("MalaPalabra5");
        listaNegra.add("MalaPalabra6");
        listaNegra.add("MalaPalabra7");
        listaNegra.add("MalaPalabra8");
        listaNegra.add("MalaPalabra9");
        listaNegra.add("MalaPalabra10");


        String[] msjProcesado = mensaje.split("");

       /* CODIGO SIN REACTIVIDAD
       for(int i=0; i <= msjProcesado.length; i++){
            if(existePalabra(msjProcesado[i], listaNegra)){
                msjProcesado[i] = "***";
            }
        }*/
        //Arrays.stream(msjProcesado).filter(e -> e.equals("puto"));

       Arrays.stream(msjProcesado).filter(listaNegra::contains).collect(Collectors.toList());


    }
/* FUNCION PARA VERIFICAR SI LA PALABRA EXISTE EN LA LISTA NEGRA
    public static boolean existePalabra(String palabra, ArrayList<String> listaNegra){
        for(int i=0; i<= listaNegra; i++)
        {
            if(listaNegra(i).equals(palabra)){
                return true;
            }
        }
    }
*/

}
