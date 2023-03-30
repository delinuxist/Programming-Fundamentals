import java.util.HashMap;

public class Range {

    private int[] numbers = new int[6];
    private HashMap<Integer,Integer> uniq = new HashMap<Integer,Integer>();

    Range() {
        for (int i =0; i < numbers.length;i++){
            numbers[i] = getRandomNumber(49,1);
        }
    }

    public int getRandomNumber(int max,int min) {
        return (int)((Math.random() * (max - (min))) + (min));
    }

    public void insertionSort(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                int temp;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void removeDuplicates(int[] arr) {
        for(int i=0;i< arr.length;i++) {
            this.uniq.put(arr[i],arr[i]);
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public HashMap<Integer, Integer> getUniq() {
        return uniq;
    }
}
