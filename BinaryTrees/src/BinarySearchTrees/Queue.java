package BinarySearchTrees;

public class Queue<T> {
    public Node<T> front;
    private Node<T> back;
    private int amount;
    private int size;

    public Queue(int size){
        this.size  = size;
        this.amount = 0;
        front = null;
        back = null;
    }

    public Queue() {
        this.size = 1000000000;
        this.amount = 0;
        front = null;
        back = null;
    }

    public void enqueue(T t) {
        Node newNode = new Node();
        newNode.dato = t;
        newNode.pointer = null;
        if (amount < size){
            if (isEmpty()){
                front = newNode;
                back = newNode;
            }
            else{
                back.pointer = newNode;
                back = newNode;
            }
            amount++;
        }
        else{
            throw new IllegalStateException("Queue is already full.");
        }
    }

    public T dequeue() {
        if (!isEmpty()){
            T data = front.dato;
            if (front == back){
                front = null;
                back = null;
            }
            else{
                front = front.pointer;
            }
            amount--;
            return data;
        }
        else{
            throw new RuntimeException("Cannot remove elements from empty queue.");
        }
    }

    public boolean isEmpty() {
        return (amount == 0)? true : false;
    }
}
