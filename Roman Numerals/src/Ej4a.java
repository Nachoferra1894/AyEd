import java.util.Scanner;

public class Ej4a {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int a = myScanner.nextInt();

        System.out.println(toRomans(a));
    }

    public static String toRomans(int a){

        StringBuilder numFinal= new StringBuilder();

        while(a!=0){
            String numI= ""+ a;

            if (a>=100){
                int cen = Integer.parseInt(String.valueOf(numI.charAt(0)));
                switch (cen) {
                    case 1 -> {
                        numFinal.append("C");
                        a -= 100;
                    }
                    case 2 -> {
                        numFinal.append("CC");
                        a -= 200;
                    }
                    case 3 -> {
                        numFinal.append("CCC");
                        a -= 300;
                    }
                    case 4 -> {
                        numFinal.append("CD");
                        a -= 400;
                    }
                    case 5 -> {
                        numFinal.append("D");
                        a -= 500;
                    }
                    case 6 -> {
                        numFinal.append("DC");
                        a -= 600;
                    }
                    case 7 -> {
                        numFinal.append("DCC");
                        a -= 700;
                    }
                    case 8 -> {
                        numFinal.append("DCCC");
                        a -= 800;
                    }
                    case 9 -> {
                        numFinal.append("CM");
                        a -= 900;
                    }
                }
                numI = "" + a;
            }
            if (a<100&&a>=10){
                int ten = Integer.parseInt(String.valueOf(numI.charAt(0)));
                switch (ten) {
                    case 1 -> {
                        numFinal.append("X");
                        a -= 10;
                    }
                    case 2 -> {
                        numFinal.append("XX");
                        a -= 20;
                    }
                    case 3 -> {
                        numFinal.append("XXX");
                        a -= 30;
                    }
                    case 4 -> {
                        numFinal.append("XL");
                        a -= 40;
                    }
                    case 5 -> {
                        numFinal.append("L");
                        a -= 50;
                    }
                    case 6 -> {
                        numFinal.append("LX");
                        a -= 60;
                    }
                    case 7 -> {
                        numFinal.append("LXX");
                        a -= 70;
                    }
                    case 8 -> {
                        numFinal.append("LXXX");
                        a -= 80;
                    }
                    case 9 -> {
                        numFinal.append("XC");
                        a -= 90;
                    }
                }
                numI = "" + a;
            }
            if (a<10){
                int one = Integer.parseInt(String.valueOf(numI.charAt(0)));
                switch (one) {
                    case 1 -> {
                        numFinal.append("I");
                        a -= 1;
                    }
                    case 2 -> {
                        numFinal.append("II");
                        a -= 2;
                    }
                    case 3 -> {
                        numFinal.append("III");
                        a -= 3;
                    }
                    case 4 -> {
                        numFinal.append("IV");
                        a -= 4;
                    }
                    case 5 -> {
                        numFinal.append("V");
                        a -= 5;
                    }
                    case 6 -> {
                        numFinal.append("VI");
                        a -= 6;
                    }
                    case 7 -> {
                        numFinal.append("VII");
                        a -= 7;
                    }
                    case 8 -> {
                        numFinal.append("VIII");
                        a -= 8;
                    }
                    case 9 -> {
                        numFinal.append("IX");
                        a -= 9;
                    }
                }
                numI = "" + a;
            }


        }
        return numFinal.toString();
    }

}
