package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class Sort {

    ArrayList<Integer> numbers = new ArrayList<>();

    HashSet<Integer> uniq = new HashSet<>();

    public Sort() {
        for(int i =0;i<6;i++) {
            numbers.add(genRandomNumbers(49,1));
        }
    }

    int genRandomNumbers(int max,int min) {
        return (int)(Math.random() * (max - (min)) + (min));
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public HashSet<Integer> getUniq() {
        return uniq;
    }

    public void calcUniq() {
        uniq.addAll(numbers);
    }
}
