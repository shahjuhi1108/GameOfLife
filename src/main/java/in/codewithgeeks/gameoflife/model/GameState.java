package in.codewithgeeks.gameoflife.model;

import java.util.Arrays;

public class GameState {

    public char[][] chars;

    public GameState(char[][] chars){
        this.chars = chars;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < chars[0].length; j++){
                str.append(chars[i][j]);
                str.append('\t');
            }
            str.append('\n');
        }
        return str.toString();
    }
}
