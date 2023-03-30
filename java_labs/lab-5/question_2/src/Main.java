import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Range r1 = new Range();

//       Arrays.sort(r1.getNumbers());

        r1.insertionSort(r1.getNumbers());


        for(int i :r1.getNumbers() ){
            System.out.println(i);
        }

        r1.removeDuplicates(r1.getNumbers());

        System.out.println("<<<<<<Removed Duplicates");
        for(int i : r1.getUniq().values()){
            System.out.println(i);
        }

    }
}