package edu.dmacc.codedsm.examples;

import java.util.ArrayList;
import java.util.Random;

public class RandomIntegerListGenerator {

    public static void main(String[] args) {
        ArrayList<Integer> integers = generateIntegers(20);
        for (int i : integers) {
            System.out.println("i = " + i);
        }
    }

    public static ArrayList<Integer> generateIntegers(int size) {
        ArrayList<Integer> xs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            xs.add(Math.abs(random.nextInt(Integer.MAX_VALUE - 1) + 1));
        }
        return xs;
    }

}
