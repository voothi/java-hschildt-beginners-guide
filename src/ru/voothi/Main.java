package ru.voothi;

public class Main {
    public static void main(String[] args) {
        int i, k;
        i = 0;
        k = 0;
//        k = i++;
        k = i;
        i = i + 1;
        System.out.println("k = " + k);
    }
}
