import java.util.Scanner;

public class Name2Binary {
    /*
    Programa que recibe una cadena de caracteres por pantalla y lo convierte a binario
    a través del código ASCII de sus caracteres

    Introducir la base a la que se quiere convertir (2,8,16)
     */

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca su nombre");

        String name = reader.next();

        for (int j = 0; j < name.length();j++) {
            int letra = name.charAt(j);
            int aux = 0;
            String binario = "";
            int i = letra;

            for (; i > 1; i = i / 2) {
                aux = i % 2;
                binario = aux + binario;
            }

            binario = i + binario;
            System.out.println(name.charAt(j) + ": " + binario);
        }
    }
}
