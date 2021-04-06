public class main {
    public static void main (String[] args) {
        DinamicQueue cola = new DinamicQueue();
       cola.enqueue("a");
       cola.enqueue("c");
       cola.enqueue("d");
       cola.enqueue("d");
       cola.enqueue("d");
       cola.enqueue("d");
       cola.enqueue("d");
       cola.enqueue("d");
       cola.enqueue("d");
       cola.enqueue("d");
       cola.enqueue("h");



        //System.out.println("Ultimo elemento: "+ cola.peek());

        cola.dequeue();

        //System.out.println("Ultimo elemento: "+ cola.peek());

        System.out.println(cola.stringgify());

        DinamicStack pila = new DinamicStack();
        pila.stack("a");
        pila.stack("c");
        pila.stack("d");
        pila.stack("d");
        pila.stack("d");
        pila.stack("d");
        pila.stack("d");
        pila.stack("d");
        pila.stack("d");
        pila.stack("d");
        pila.stack("h");



        //System.out.println("Ultimo elemento: "+ cola.peek());

        pila.pop();

        //System.out.println("Ultimo elemento: "+ cola.peek());

        System.out.println(pila.stringgify());



    }
}