import java.util.Scanner;

public class IntegerToRoman {

    public static void integerToRoman(int num) {

        System.out.println(num);
        int[] intsRomanos = {900,500,400,100,90,50,40,10,9,5,4,1};
        String[] stringRomanos = {"CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String roman = new String();

        for(int i=0;i<intsRomanos.length;i++) {
            while(num >= intsRomanos[i]) {
                num -= intsRomanos[i];
                roman += (stringRomanos[i]);
            }
        }
        System.out.println("Roman: " + roman);
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese el numero");
        int number = myScanner.nextInt();
        integerToRoman(number);
    }
}