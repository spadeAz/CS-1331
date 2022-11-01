public class Bakery {
    private String product;
    private int quantity;
    private double cost;

    public Bakery(String product, int quantity, double cost) {
        this.product = product;
        this.quantity = quantity;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String str(){
        return  "Bakery Product: " + product + ", " +
                "Quantity: " + quantity + ", " +
                "Cost: " + String.format("%.2f", cost);
    }
}
