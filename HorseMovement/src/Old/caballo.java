package Old;

public class caballo<T> {
    String initialPosition;
    tablero miTablero = new tablero();
    int moveCounter = 0;
    int maxMoves = 4;


    public caballo(String initialPosition){
        this.initialPosition=initialPosition;
    }

    public caballo(){
        this.initialPosition="a1";
    }
    public caballo(int maxMoves){
        this.initialPosition="a1";
        this.maxMoves=maxMoves;
    }

    public caballo(String initialPosition,int maxMoves){
        this.initialPosition=initialPosition;
        this.maxMoves=maxMoves;
    }



    public void start() {
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