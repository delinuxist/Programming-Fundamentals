public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Workers w1 = new Workers();
        Workers w2 = new Workers();
        Workers w3 = new Workers();

        System.out.println(Workers.getCount());
        for(int a : Workers.getPresent()){
            System.out.println(a);
        }
    }
}