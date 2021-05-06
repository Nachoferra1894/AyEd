package Metrovias;

import DataStructures.Queues.EmptyQueueException;
import DataStructures.Stacks.DynamicStack;
import DataStructures.Stacks.EmptyStackException;

public class Metrovias {

    private final Window[] windows;
    private final int amountWindows;
    int currentTime;
    private int peopleCalledCurrent;


    public Metrovias(int amountWindows){
        this.amountWindows = amountWindows;
        windows = new Window[amountWindows];
        initiateMetrovias();
        currentTime = 0;
        peopleCalledCurrent = 0;
    }
    public void initiateMetrovias(){
        for (int i = 0; i < getAmountWindows(); i++) {
            windows[i] = new Window();
        }
    }
    public void pass30Seconds() throws EmptyQueueException { //30 seconds are added on the clock. That time is taken as reference for newly arrived passengers
        Passenger[] newlyArrived = new Passenger[5];
        for (int i = 0; i < 5; i++) { // 5 passengers are created and assigned to a random window
            newlyArrived[i] = new Passenger(currentTime);
            int randWindow = (int) ((Math.random() * getAmountWindows()));
            windows[randWindow].enqueuePassenger(newlyArrived[i]);
        }
        callNext();
        currentTime+= 30;
    }

    private void callNext() throws EmptyQueueException { //We see if a passenger should be called (50% chance)
        peopleCalledCurrent = 0;

        for (Window w: windows) {
            int chanceToBeCalled = (int) ((Math.random() * 100)); //50% chance to be called or not

            if (chanceToBeCalled >= 50 && !w.buffer.isEmpty()) {
                peopleCalledCurrent += w.buffer.size();
                w.callPassenger(currentTime);
                peopleCalledCurrent -= w.buffer.size();
            }
        }
    }

    public Window[] getWindows() {return windows;}

    public int getAmountWindows() {return amountWindows;}

    public int getPeopleCalledCurrent() {return peopleCalledCurrent;}

    public DynamicStack<Ticket> gettotalTickets() throws EmptyStackException { // No funciona
        DynamicStack<Ticket> tickets = new DynamicStack<>();
        for (Window w: windows) {
            while (!w.tickets.isEmpty()){ //No funciona. Toma como que no hay ningun ticket en las ventanas. Chequear metodo callPassenger en Windows?
                tickets.push(w.tickets.peek());
                w.tickets.pop();
            }
        }
        return tickets;
    }

    public int passengersInLine(){
        int passengersInLine = 0;
        for (Window w: windows) {
            passengersInLine += (w.getTotalPassengers() - w.getPassengersCalled());
        }
        return passengersInLine;
    }

    public int getTotalPassengersCalled(){
        int totalPassengersCalled = 0;
        for (Window w: windows) {
            totalPassengersCalled += w.getPassengersCalled();
        }
        return totalPassengersCalled;
    }
}