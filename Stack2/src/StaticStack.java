import exeptions.IsEmptyException;
import interfaces.StackInterface;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StaticStack<T> implements StackInterface {
    int tope;
    Object[] pila;

    StaticStack() {
        int tope = 0;
        pila = new Object[10];
    }


    public boolean isEmpty(){
        return tope==0;
    }

    public T peek() {
        return (T) pila[tope];
    }

    public void pop() {
        try {
            if (tope>0) { // No elimina el ultimo elemento, ya que la proxima vez que llame push lo elimina solo
                tope--;
            } else {
                throw new IsEmptyException();
            }
        } catch (IsEmptyException e) {
            e.getMessage();
        }

    }

    public void stack(Object element) {
        if (tope!=0 && pila[tope-1].getClass().getName()!= element.getClass().getName()){
            System.out.println("Ingrese objetos del mismo tipo"); // Si son de tipos diferentes, explota
            return;
        }
        if (tope>=pila.length) {
            agrandarPila();  // Si el tope es mayor que el tamaño del arreglo, hace esto para no entrar en indexOutOfBounds
        }
        pila[tope]= element; // Agrega el utlimo elemento al tope
        tope++;
    }

    public int size(){
        return tope;
    }

    public void empty(){
        tope=0;
    }


    public String stringgify(){
        String toString = "[";
        for (int i = 0; i <tope-1 ; i++) { // Va hasta uno menos que tope-1, asi el ultimo elemento me queda mas lindo
            toString+=pila[i].toString()+",";
        }
        toString+=pila[tope-1].toString()+"]"; // Voy hasta tope-1
        return toString;
    }

    private void agrandarPila() {
        pila = Arrays.copyOf(pila, tope+10); // Es como crear otra cola, pero mas simple

    }



}
