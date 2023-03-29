public class Employee extends Person implements Prototype {

    Employee(String name,String email,int age,double height){
        super(name,email,age,height);
    }

    @Override
    public Person createClone() {
        return new Employee(this.getName(),this.getEmail(),this.getAge(),this.getHeight());
    }
}
