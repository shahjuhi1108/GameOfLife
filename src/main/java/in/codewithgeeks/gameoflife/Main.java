package in.codewithgeeks.gameoflife;

import in.codewithgeeks.gameoflife.logic.StateProcessor;
import in.codewithgeeks.gameoflife.model.GameState;
import in.codewithgeeks.gameoflife.parser.ConsoleParser;
import in.codewithgeeks.gameoflife.parser.FileParser;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        ConsoleParser console = new ConsoleParser();
//        console.getState();
        FileParser file = new FileParser("/Users/juhi/Documents/Git/GameOfLife/resources/input.txt");
        GameState state = file.getState();
        System.out.println(Arrays.deepToString(state.chars));

        StateProcessor processor = new StateProcessor();
        while(true) {
            state = processor.getNextState(state);
            System.out.println(state);
            Thread.sleep(1000);
            System.out.println("----------------------------------------------");
        }
    }
}
