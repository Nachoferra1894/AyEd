import interfaces.QueueInterface;

import java.util.Queue;

public class StaticQueue<T> {

    private T[] array;
    private int front;
    private int back;
    private int size;

    public StaticQueue(int size) {
        this.size = size;
        front = 0;
        back = 0;
        array = (T[]) new Object[size];
    }
/*
    public void enqueue(T t) {
        if (back != size) back++;
        else {
            if (back < array.length) {
                array[back]=t;
                size++;
            } else {
                back=0;
                array[back]=t;
                size++;
            }


        }
    }

    public T dequeue() {
        T element = array[front];
        front++;
        size--;
        return element;
    }


    public boolean isEmpty() {

    }

    public int length() {

    }

    public int size() {
        return size;
    }

    public void empty() {
        front = 0;
        back = 0;
        amount = 0;
    }

    private void manage(){
        if (back != size) back++;
        else {
            if (back < array.length) {
                array[back]=
            }

            else throw new IllegalStateException("Queue is full.");
        }
    }
}*/
}