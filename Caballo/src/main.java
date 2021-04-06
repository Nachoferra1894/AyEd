public class main {
    public static void main (String[] args) {
        caballo miCaballo = new caballo();
        System.out.println("Puedo elegir la posicion inicial");
        caballo miCaballoPosIn = new caballo("c3");
        System.out.println("O establecer la cantidad de movimientos maxima");
        caballo miCaballoMAxMoves = new caballo(8);
    }
}
