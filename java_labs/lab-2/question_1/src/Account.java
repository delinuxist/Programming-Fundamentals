public class Account{
    private static double total;

    public void setTotal(double total) {
        this.total += total;
    }

    public double getTotal() {
        return this.total;
    }
}
