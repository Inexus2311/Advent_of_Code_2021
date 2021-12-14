package dev.insomnia;

import java.util.List;

public class Day03 extends AOCPuzzle {


    public Day03() {
        super("3");
    }

    @Override
    void solve(List<String> input) {
        //  interate the input

        int[] ones = new int[input.get(0).length()];
        int[] zeros = new int[input.get(0).length()];

        for (String s : input) {
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == '0') {
                    zeros[i]++;
                } else {
                    ones[i]++;
                }
        }

        long gamma = 0;
        long epsilon = 0;

        // Calculate it into binary
        // 2^11 2^10 2^9 2^8 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0

        for (int i = 0; i < ones.length; i++) {
            if (ones[i] > zeros[i]) {
                gamma += Math.pow(2, ones.length - (i + 1));
            } else {
                epsilon += Math.pow(2, ones.length - (i + 1));

            }
        }

        lap(gamma*epsilon);

    }
}

