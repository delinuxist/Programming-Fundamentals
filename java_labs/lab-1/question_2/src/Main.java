public class Main {
    public static void main(String[] args) {
        double rand;

        rand = Math.floor(Math.random() * 100);

        System.out.println(rand);
        if (rand == 0) {
            System.out.println("Frozen");
        } else if(rand >= 1 && rand <= 14){
            System.out.println("cold");
        } else if(rand >= 15 && rand <= 24){
            System.out.println("cool");
        } else if( rand >= 25 && rand <= 40){
            System.out.println("warm");
        } else if(rand >= 41 && rand <= 60){
            System.out.println("hot");
        } else if(rand >= 61 && rand <= 80){
            System.out.println("very hot");
        } else if(rand >= 81 && rand <= 99){
            System.out.println("extremely hot");
        } else {
            System.out.println("boiling");
        }
    }
}