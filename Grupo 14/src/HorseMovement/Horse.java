package HorseMovement;

import DataStructures.Stacks.DynamicStack;

public class Horse {
public Position position;
private Position initialPosition;
private Position[] possiblePositions;
int moveCounter = 0;
int maxMoves = 4;

    public Horse(Position initialPosition){
        this.position = initialPosition;
        this.initialPosition = initialPosition;
    }

    public Horse(){this.position = null; }

    public void setInitialPosition(Position pos){
        this.position = pos;
        this.initialPosition = pos;
    }

    public String move(Position aPosition) throws OutOfMovesException, OutOfBoardException {//We couldnt get a random element from the stack so it wouldn't be repetitive.
        if (moveCounter < maxMoves){
            this.position = aPosition;
            //int pickAMove = (int) ((Math.random() * (getPossibleMoves().getSize())));
            //this.position = possiblePositions[pickAMove]; //We updated the previous position with a random valid new one
        }
        else{ throw new OutOfMovesException("Your horse has already moved 4 times");}
        moveCounter++;
        return this.position.getPosition();
    }

    public DynamicStack<Position> getPossibleMoves() {return getPossibleMoves(this.position);}
    public DynamicStack<Position> getPossibleMoves(Position aPosition){
        possiblePositions = new Position[8];
        DynamicStack<Position> possibleMoves = new DynamicStack<>();

        possiblePositions[0] = new Position(aPosition.getColumn() -2, aPosition.getRow() +1);
        possiblePositions[1] = new Position(aPosition.getColumn() -2, aPosition.getRow() -1);
        possiblePositions[2] = new Position(aPosition.getColumn() -1, aPosition.getRow() +2);
        possiblePositions[3] = new Position(aPosition.getColumn() +1, aPosition.getRow() -2);
        possiblePositions[4] = new Position(aPosition.getColumn() +1, aPosition.getRow() +2);
        possiblePositions[5] = new Position(aPosition.getColumn() -1, aPosition.getRow() -2);
        possiblePositions[6] = new Position(aPosition.getColumn() +2, aPosition.getRow() +1);
        possiblePositions[7] = new Position(aPosition.getColumn() +2, aPosition.getRow() -1);

        for (int i = 0; i < 8; i++) {
            if(possiblePositions[i].isValid()){
                possibleMoves.push(possiblePositions[i]);
            }
        }
        return possibleMoves;
    }

    public String getCurrentPosition() throws OutOfBoardException {
        if (this.position != null) {
            return this.position.getPosition();
        }else{
            return "";
        }
    }
    public Position getPosition(){ return this.position;}

    public int getMoveCounter() {
        return moveCounter;
    }

    public Position getInitialPosition() {return initialPosition;}
}
