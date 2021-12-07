package dev.insomnia;

//import java.util.ArrayList;
import java.util.List;

public class Day01 extends AOCPuzzle {

    public Day01()
    {
        super("1");
    }

    @Override
    void solve(List<String> input)
    {
        List<Integer>depths = convertToInts(input);
        int changes =0;
        for (int i= 1; i < depths.size(); i++)
        {
            if(depths.get(i - 1) < depths.get(i))
            {
                changes++;
            }
        }
        lap(changes);
    }



}

