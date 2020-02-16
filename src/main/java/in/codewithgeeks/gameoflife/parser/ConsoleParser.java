package in.codewithgeeks.gameoflife.parser;

import in.codewithgeeks.gameoflife.model.GameState;

import java.util.Scanner;

public class ConsoleParser implements Parser {
    @Override
    public GameState getState() {

        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        int column = scan.nextInt();

        char[][] matrix = new char[row][column];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix[i][j] = scan.next().charAt(0);
            }
        }

        return new GameState(matrix);
    }
}
