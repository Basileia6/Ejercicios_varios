import java.util.Scanner;

public class Name2systemnumeric {

    public static void main (String[] args){

        int aux;

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String name = reader.next();

        System.out.println("Introduzca la base a la que lo quiere convertir (2,8,16)");
        int base = reader.nextInt();

        if (base != 2 && base != 8 && base != 16){
            System.out.println("La base introducida no es válida");
        }
        else {
            for (int j = 0; j < name.length(); j++) {
                int letra = name.charAt(j);
                String binario = "";
                int i = letra;

                for (; i > base - 1; i = i / base) {
                    aux = i % base;
                    if (base == 16){
                        char hex;
                        switch (aux){
                            case 10: hex = 'A'; break;
                            case 11: hex = 'B'; break;
                            case 12: hex = 'C'; break;
                            case 13: hex = 'D'; break;
                            case 14: hex = 'E'; break;
                            case 15: hex = 'F'; break;
                            default: hex = String.valueOf(aux).charAt(0);
                        }
                        binario = hex + binario;
                    }
                    else {
                        binario = aux + binario;
                    }
                }
                binario = i + binario;
                System.out.println(name.charAt(j) + ": " + binario);
            }
        }
    }
}
