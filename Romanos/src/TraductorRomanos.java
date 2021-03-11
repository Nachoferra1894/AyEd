import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TraductorRomanos {

    public static void main (String args[]) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String word = sc.nextLine();
        String wordToUpper = word.toUpperCase();
        toRoman(wordToUpper);

    }

    private static void toRoman(String wordToUpper) {

        LinkedList lista = new LinkedList<Integer>();
        Integer sum = 0;

        for (int i = 0; i < wordToUpper.length(); i++){
            char letra = wordToUpper.charAt(i);
            switch (letra){
                case 'I':
                    lista.add(1);
                    break;
                case 'V':
                    lista.add(5);
                    break;
                case 'X':
                    lista.add(10);
                    break;
                case 'L':
                    lista.add(50);
                    break;
                case 'C':
                    lista.add(100);
                    break;
                case 'D':
                    lista.add(500);
                    break;
                default:
                    System.out.println("Letra no reconocida");
            }
        }

        sum = (Integer) lista.get(lista.size()-1);
        for (int i = lista.size()-2; i >=0 ; i--) {
            if ((Integer) lista.get(i)>= (Integer) lista.get(i+1)){
                sum =  (Integer) lista.get(i) + sum;
            } else {
                sum = sum - (Integer) lista.get(i);
            }
        }
        System.out.println("Romano:" + sum);

    }

}
