public class Arraysinrepetidos {

    public static void main (String[] args){
        int[] carton = new int[10];
        int[] numeros = new int[99];
        boolean bingo = false;
        int numlinea = 0;
        int numbingo = 0;
        int intentoslinea = 0;
        int intentosbingo = 0;

        for (int i=0;i< carton.length;i++) {
            int numrd = (int) (Math.random() * 99) + 1;
            boolean duplicado = false;

            //System.out.println("***********");
            for (int j = 0; j <= i && !duplicado; j++) {
                System.out.println(numrd);
                if (carton[j] == numrd) {
                    duplicado = true;
                }
            }

            if(!duplicado) {
                carton[i] = numrd;
            }
        }



        for (int i=0;i< numeros.length && !bingo ;i++) {
            int num = (int) (Math.random() * 99) + 1;
            boolean duplicado = false;

            //System.out.println("***********");
            for (int j = 0; j <= i && !duplicado; j++) {
                System.out.println(num);
                if (carton[j] == num) {
                    duplicado = true;
                }
            }

            if(!duplicado) {
                numeros[i] = num;
                for (int j = 0; j <= carton.length; j++){
                    if (carton[j] == num){
                        numlinea++;
                        numbingo++;
                    }
                }
            }

            if (numlinea == 0){
                intentoslinea = i;
            }
            if (numbingo == 0){
                intentosbingo = i;
                bingo = true;
            }
        }
    }
}
