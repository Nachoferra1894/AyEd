import java.util.LinkedList;
import java.util.Scanner;

public class RomanToInteger {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String word = sc.nextLine();
        String wordToUpper = word.toUpperCase();
        toRoman(wordToUpper);
    }

    private static void toRoman(String wordToUpper) {

        LinkedList<Integer> lista = new LinkedList<Integer>();
        Integer sum = 0;

        for (int i = 0; i < wordToUpper.length(); i++){
            char letra = wordToUpper.charAt(i);
            switch (letra) {
                case 'I' -> lista.add(1);
                case 'V' -> lista.add(5);
                case 'X' -> lista.add(10);
                case 'L' -> lista.add(50);
                case 'C' -> lista.add(100);
                case 'D' -> lista.add(500);
                default -> System.out.println("Letra no reconocida");
            }
        }

        sum = lista.get(lista.size()-1);
        for (int i = lista.size()-2; i >=0 ; i--) {
            if (lista.get(i) >= lista.get(i+1)){
                sum =  lista.get(i) + sum;
            } else {
                sum = sum - lista.get(i);
            }
        }
        System.out.println("Romano:" + sum);
    }
}
