import java.util.Scanner;

public class Ej4c {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int n = myScanner.nextInt();
        while(n >= 1000 || n <= 0) {
            System.out.println("El número debe estar entre 1 y 999. Por favor, ingrese otro númerohgf");
            n = myScanner.nextInt();
        }
        System.out.println("El número " + n + " en romano es:\t" + toRomanNumber(n));
    }

    private static String toRomanNumber(int n) {

        String hundredsInRoman, tensInRoman, unitsInRoman;

        int hundreds = n/100;
        int tens = (n - hundreds*100)/10;
        int units = (n - hundreds*100 - tens*10);

        hundredsInRoman = switch (hundreds) {
            case 1 -> "C";
            case 2 -> "CC";
            case 3 -> "CCC";
            case 4 -> "CD";
            case 5 -> "D";
            case 6 -> "DC";
            case 7 -> "DCC";
            case 8 -> "DCCC";
            case 9 -> "CM";
            default -> "";
        };

        tensInRoman = switch (tens) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            default -> "";
        };

        unitsInRoman = switch (units) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";
        };

        return hundredsInRoman + tensInRoman + unitsInRoman;

    }

}
