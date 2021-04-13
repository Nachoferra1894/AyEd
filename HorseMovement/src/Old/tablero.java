package Old;

public class tablero {
    boolean[][] elTablero;
    String initialPosition;


    public tablero(){ }

    public DinamicStack moves(String position) {
        char column = position.toLowerCase().charAt(0);
        int numberOfColumna;

        int row = Character.getNumericValue(position.charAt(1));
        if (row>8 || row<1){
            System.out.println("Casilla invalida");
            return null;
        }

        switch (column) {
            case 'a':
                numberOfColumna = 1;
                break;
            case 'b':
                numberOfColumna = 2;
                break;
            case 'c':
                numberOfColumna = 3;
                break;
            case 'd':
                numberOfColumna = 4;
                break;
            case 'e':
                numberOfColumna = 5;
                break;
            case 'f':
                numberOfColumna = 6;
                break;
            case 'g':
                numberOfColumna = 7;
                break;
            case 'h':
                numberOfColumna = 8;
                break;
            default:
                System.out.println("Casilla invalida");
                return null;
        }

        return searchForMovements(numberOfColumna,row);
    }

    private DinamicStack searchForMovements(int column, int row) {
        DinamicStack dinamicStack = new DinamicStack();
        //Arriba
        addValue((column+1),(row+2),dinamicStack);
        addValue((column-1),(row+2), dinamicStack);
        //Abajo
        addValue((column+1),(row-2), dinamicStack);
        addValue((column-1),(row-2), dinamicStack);
        //Izq
        addValue((column-2),(row+1), dinamicStack);
        addValue((column-2),(row-1), dinamicStack);
        //Der
        addValue((column+2),(row+1), dinamicStack);
        addValue((column+2),(row-1), dinamicStack);

        return dinamicStack;
    }

    private void addValue(int columnToAdd, int rowToAdd, DinamicStack dinamicStack) {
        if (columnToAdd>0 && rowToAdd>0 && columnToAdd<9 && rowToAdd<9){
            dinamicStack.stack(numberToBox(columnToAdd,rowToAdd));
        }
    }

    /*
    private void initiateTablero (){
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <8 ; j++) {
                elTablero[i][j] = false;
            }
        }
    }*/

    private String numberToBox(int column,int row){
        String wordOfbox;

        switch (column) {
            case 1:
                wordOfbox = "a";
                break;
            case 2:
                wordOfbox = "b";
                break;
            case 3:
                wordOfbox = "c";
                break;
            case 4:
                wordOfbox = "d";
                break;
            case 5:
                wordOfbox = "e";
                break;
            case 6:
                wordOfbox = "f";
                break;
            case 7:
                wordOfbox = "g";
                break;
            case 8:
                wordOfbox = "h";
                break;
            default:
                System.out.println("Casilla invalida");
                return null;
        }
        wordOfbox=wordOfbox+row;
        return wordOfbox;
    }


}
