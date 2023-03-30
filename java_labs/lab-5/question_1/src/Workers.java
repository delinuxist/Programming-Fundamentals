public class Workers {
    private static int[] present = new int[5];
    private static int count = 0;
    private static int counter = 0;

    Workers() {
        count++;
        present[counter] = count;
        counter++;
    }

    public static int[] getPresent() {
        return present;
    }

    public static int getCount() {
        return count;
    }


}
