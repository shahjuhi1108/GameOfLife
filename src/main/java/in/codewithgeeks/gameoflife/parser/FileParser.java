package in.codewithgeeks.gameoflife.parser;

import in.codewithgeeks.gameoflife.model.GameState;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileParser implements Parser {

    private String path;

    public FileParser(String path){
        this.path = path;
    }
    @Override
    public GameState getState() {
        File file = new File(path);
        try {
            Scanner scan = new Scanner(file);
            int row = scan.nextInt();
            int column = scan.nextInt();

            char[][] matrix = new char[row][column];

            for(int i = 0; i < row; i++){
                for(int j = 0; j < column; j++){
                    matrix[i][j] = scan.next().charAt(0);
                }
            }

            return new GameState(matrix);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;

    }
}
