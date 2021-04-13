import exeptions.IsEmptyException;
import interfaces.StackInterface;

public class DinamicStack<T> implements StackInterface<T> {
    private Node tope;
    private int size;

    DinamicStack() {}

    public boolean isEmpty (){
        return tope==null;
    }

    public T peek(){
        return (T) tope.getDato();
    }

    public void pop() {
        if (tope!=null) {
            tope = tope.getNext();
            size--;
        } else throw new IsEmptyException();
    }

    public void stack(T newObject) {

        Node aux = new Node();
        aux.setDato(newObject);

        if (tope != null) {
            aux.setNext(tope);
        }
            tope = aux;
            size++;
    }

    public int size() {
        return size;
    }

    public void empty (){
        tope=null;
        size=0;
    }



    public String stringgify() {

        String toString = "[";
        Node newTope = tope;

        while (newTope!=null){
            toString+=newTope.getDato()+",";
            newTope=newTope.getNext();
        }
        return toString+"]";
    }


}
