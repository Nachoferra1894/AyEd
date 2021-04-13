package Old;

public class main {
    public static void main (String[] args) {
        caballo miCaballo = new caballo();
        miCaballo.start();

        System.out.println("Puedo elegir la posicion inicial");
        caballo miCaballoPosIn = new caballo("a1");
        miCaballoPosIn.start();

        System.out.println("O establecer la cantidad de movimientos maxima");
        caballo miCaballoMAxMoves = new caballo(8);
        miCaballoMAxMoves.start();
    }
}
