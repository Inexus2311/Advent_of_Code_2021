package dev.insomnia;

import java.util.ArrayList;

import java.util.List;


public class Day01 extends AOCPuzzle {

    public Day01()
    {
        super("1");
    }

    void println_measurement(boolean change)
    {
        if(change)
        {
            System.out.println(" (increased)");
        }
        else{
            System.out.println(" (decreased)");
        }
    }
    @Override
    void solve(List<String> input) {
        List<Integer> depths = convertToInts(input);
        int changes = 0;
        for (int i = 1; i < depths.size(); i++) {
            if (depths.get(i - 1) < depths.get(i)) {
                changes++;
            }
        }
        lap(changes);

        // Group numbers in a three-measurement input

        List<Integer> windows = new ArrayList<>();
        for(int i = 2; i < depths.size(); i++) {

            windows.add(depths.get(i) + depths.get(i -1) + depths.get(i -2 ));
        }

        changes = 0;
        for (int i = 1; i < windows.size(); i++) {
            if (windows.get(i - 1) < windows.get(i)) {
                changes++;
            }
        }
        lap(changes);

        boolean flag = true;

        for (int i = 0; i < windows.size(); i++) {

            if (flag)
            {
                flag=false;
                System.out.print("Startnumber: ");
                System.out.print(windows.get(i));
                System.out.println(" (N/a no previous measurement)");
            }
            else{
                if (windows.get(i - 1) < windows.get(i)) {

                    System.out.print(windows.get(i));
                    println_measurement(true);
                }
                else
                {
                    System.out.print(windows.get(i));
                    println_measurement(false);
                }
            }


        }
    }
}

