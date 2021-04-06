import exeptions.IsEmptyException;
import interfaces.QueueInterface;

import java.util.Arrays;

public class DinamicQueue<T> implements QueueInterface {

    private Node front;
    private Node back;
    private int size;


    DinamicQueue() {
        size=0;
        front = null;
        back = null;
    }

    public void enqueue(Object element) {
        Node aux = new Node();
        aux.dato=element;
        aux.next = null;

        if (isEmpty()){
            front = aux;
            back = aux;
        } else {
            back.next=aux;
            back = aux;
        } size++;

    }

    public T dequeue() {
        if (isEmpty()){
            throw new IsEmptyException();
        } else {
            T data = (T) front.getDato();
            if (front == back){
                front = null;
                back = null;
            }
            else{
                front = front.next;
            }
            size--;
            return data;
        }
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int size() {
        return size;
    }

    public String stringgify() {

        String toString = "[";
        Node newTope = front;

        while (newTope!=null){
            toString+=newTope.getDato()+",";
            newTope=newTope.getNext();
        }
        return toString+"]";
    }


}
