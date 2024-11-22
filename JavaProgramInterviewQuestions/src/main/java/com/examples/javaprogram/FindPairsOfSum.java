package com.examples.javaprogram;
public class FindPairsOfSum {
    public static void main(String[] args) {
        int[] a = {5, 6, 9, 3, 4, 2, -1};
        int x = 8;
        findPairs(a, x);
    }
    public static void findPairs(int[] array, int Sum) {
        System.out.println("Pair with sum " + Sum + ":");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == Sum) {
                    System.out.println("{" + array[i] + "," + array[j] + "}");
                }
            }
        }
    }
}