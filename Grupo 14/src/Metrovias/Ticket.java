package Metrovias;

import java.util.Random;

public class Ticket {
    int price;
    int time;
    int code;

    public Ticket(int waitTime){
        this.time = waitTime;
        price = 10;
        Random r = new Random();
        code = ((1 + r.nextInt(2)) * 10000 + r.nextInt(1000));
    }

    public int getPrice() { return price;}

    public int getTime() {return time;}

    public int getCode() {return code;}

}

