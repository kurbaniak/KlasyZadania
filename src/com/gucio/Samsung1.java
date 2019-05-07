package com.gucio;

import java.util.Random;

public class Samsung1 {


    int n;
    int[] table;

    public void solution(int number) {
        table = new int[number];

        for (int i = 0; i < number - 1; i++) {
            Random random = new Random();
            table[i] = random.nextInt();
        }
        int sum = 0;

        for (int i : table
        ) {
            sum = sum + i;
        }
        table[number - 1] = sum * -1;

        for (int i : table) {
            System.out.println(i);
        }

    }
}


