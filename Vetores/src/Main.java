import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] numeros = {1, 2, 3, 4, 5};
//        for(int i=0; i < numeros.length; i++){
//            System.out.println(numeros[i]);
//        }

//        System.out.println(Arrays.toString(numeros));

        int[] numeros = {9, 10, 12, 25, 2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for(int i=0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor ){
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
        System.out.println("Media = " + media/numeros.length);
    }
}