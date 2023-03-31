package main.java;

import ArrayList.Sort;
import Set.SetExample;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Sort s1 = new Sort();
        Collections.sort(s1.getNumbers());

        for(int i:s1.getNumbers()){
            System.out.println(i);
        }

        System.out.println("<<<unique numbers");
        s1.calcUniq();
        for (int i: s1.getUniq()){
            System.out.println(i);
        }

        System.out.println("<<< Same with Set");
        SetExample s2 = new SetExample();

        for (int i : s2.getNumbers()){
            System.out.println(i);
        }
    }
}