package dev.insomnia;

import java.util.List;

public class Day02 extends AOCPuzzle {


    public Day02() {
        super("2");
    }

    void Task1(List<String> input)
    {
        long horizontal = 0;
        long depth = 0;

        for(String s :input)
        {
            String[] list = s.split(" ");
            switch (list[0]) {
                case "up" -> depth -= Integer.parseInt(list[1]);
                case "forward" -> horizontal += Integer.parseInt(list[1]);
                case "down" -> depth += Integer.parseInt(list[1]);
            }
        }
        lap(depth);
        lap(horizontal*depth);
    }


    void Task2(List<String>input)
    {

        // Variables
        long horizontal = 0;
        long depth = 0;
        long aim = 0;

        for(String s: input)
        {

            String [] list = s.split(" ");

            switch(list[0])
            {
                case "up" -> aim -= Integer.parseInt(list[1]);
                case "forward" -> {
                    horizontal += Integer.parseInt(list[1]);
                    depth += (aim * Integer.parseInt(list[1]));
                }
                case "down" -> aim += Integer.parseInt(list[1]);
            }
        }
        System.out.print("depth: ");lap(depth*horizontal);
        System.out.print("horizontal: " + horizontal);
        System.out.println(" ");
    }
    @Override
    void solve(List<String> input) {

        Task1(input);
       // Task2(input);

    }
}
