package dev.insomnia;

import java.util.List;

public class Day02 extends AOCPuzzle {


    public Day02() {
        super("2");
    }



    @Override
    void solve(List<String> input) {

        long horizontal = 0;
        long depth = 0;

        for(String s :input)
        {
            String[] instructionparts = s.split(" ");
            switch (instructionparts[0]) {
                case "up" -> depth -= Integer.parseInt(instructionparts[1]);
                case "forward" -> horizontal += Integer.parseInt(instructionparts[1]);
                case "down" -> depth += Integer.parseInt(instructionparts[1]);

            }

        }
        lap(horizontal*depth);
    }
}
