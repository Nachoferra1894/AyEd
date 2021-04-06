import java.util.LinkedList;

public class caballo<T> {
    String initialPosition;
    tablero miTablero = new tablero();
    int moveCounter = 0;
    int maxMoves = 4;


    public caballo(String initialPosition){
        this.initialPosition=initialPosition;
        start(initialPosition);
    }

    public caballo(){
        this.initialPosition="a1";
        start(initialPosition);
    }
    public caballo(int maxMoves){
        this.initialPosition="a1";
        this.maxMoves=maxMoves;
        start(initialPosition);
    }



    private void start(String initialPosition) {
        String move = initialPosition.toUpperCase();

        listMoves(initialPosition,0,move);
    }

    private int listMoves (String position,int counter,String move){

        DinamicStack miStack = miTablero.moves(position);

        if (counter<maxMoves-2) {

            while (miStack.size() != 0) {
                String currentBox = (String) miStack.peek();
                miStack.pop();
                counter++;
                listMoves(currentBox,counter,move+"-"+currentBox.toUpperCase());
                counter--;
            }
        } else {
            while (miStack.size() != 0) {
                String currentBox = (String) miStack.peek();
                moveCounter++;
                System.out.println(moveCounter+") "+move+"-"+currentBox.toUpperCase());
                miStack.pop();
            }
            System.out.println("--------------");
            counter--;
        }
        return counter;

    }

}
