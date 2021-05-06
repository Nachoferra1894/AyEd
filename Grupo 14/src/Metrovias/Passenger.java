package Metrovias;

public class Passenger {
    private Ticket currentTicket;
    private Window currentWindow;
    int enteredQueue; //This saves the time at which the passenger entered the queue
    int waitTime;

    public Passenger(int enteredQueue){
        this.enteredQueue = enteredQueue;
    }

    public void assignWindow(Window aWindow){ this.currentWindow = aWindow;}

    public Window getCurrentWindow() {return currentWindow; }

    public void assignTicket(Ticket aTicket){
        this.currentTicket = aTicket;
    }

    public int getEnteredQueue() {return enteredQueue;}

    public Ticket getTicket() {return currentTicket;}

    public int getWaitTimeInSeconds(){return waitTime;}
}
