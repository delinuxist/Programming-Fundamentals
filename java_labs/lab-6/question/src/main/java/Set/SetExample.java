package Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    Set<Integer> numbers = new HashSet<>();

    public SetExample() {
        for(int i =0;i<6;i++) {
            numbers.add(genRandomNumbers(49,1));
        }
    }

    int genRandomNumbers(int max,int min) {
        return (int)(Math.random() * (max - (min)) + (min));
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }
}
