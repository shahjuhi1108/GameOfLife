package in.codewithgeeks.gameoflife.logic;

import in.codewithgeeks.gameoflife.model.GameState;

public class StateProcessor {


    private int countNeighbours(char[][] array, int row, int column){

        int live = 0;

        if(row-1 >= 0 && array[row-1][column] == 'X'){
            live++;
        }

        if(row+1 < array.length && array[row+1][column] == 'X'){
            live++;
        }

        if(column-1 >= 0 && array[row][column-1] == 'X'){
            live++;
        }

        if(column+1 < array[0].length && array[row][column+1] == 'X'){
            live++;
        }

        if(row-1 >= 0 && column-1 >= 0 && array[row-1][column-1] == 'X'){
            live++;
        }

        if(row+1 < array.length && column+1 < array[0].length && array[row+1][column+1] == 'X'){
            live++;
        }

        if(row-1 >= 0 && column+1 < array[0].length && array[row-1][column+1] == 'X'){
            live++;
        }

        if(row+1 < array.length && column-1 >= 0 && array[row+1][column-1] == 'X'){
            live++;
        }

        return live;

    }

    public GameState getNextState(GameState gameState){
        char[][] oldState = gameState.chars;
        char[][] newState = new char[oldState.length][oldState[0].length];

        for(int k = 0; k < oldState.length; k++){
            for(int l = 0; l < oldState[0].length; l++){
                newState[k][l] = '.';
            }
        }


        for(int i = 0; i < oldState.length; i++){
            for(int j = 0; j < oldState[0].length; j++){
                int live = countNeighbours(oldState, i, j);
                if(oldState[i][j] == 'X' && (live == 2 || live == 3)){
                    newState[i][j] = 'X';
                }
                else if(oldState[i][j] == '.' && live == 3){
                    newState[i][j] = 'X';
                }
                else{
                    newState[i][j] = '.';
                }
            }
        }
        return new GameState(newState);
    }

}
