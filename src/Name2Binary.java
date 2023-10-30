import java.util.Scanner;

public class Name2Binary {

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
