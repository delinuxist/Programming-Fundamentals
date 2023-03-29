public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var emp1 = new Employee("Mike","emma@gmail.com",20,5.7);

        Employee clone = (Employee) emp1.createClone();
        clone.setName("Mark");

        System.out.println(emp1);
        System.out.println(clone);

    }
}