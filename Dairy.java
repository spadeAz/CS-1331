public class Dairy {
    private String product;
    private int quantity;
    private double cost;
    private int dayToExpiration;
    private boolean isConsumable;

    public Dairy(String product, int quantity, double cost, int dayToExpiration) {
        this.product = product;
        this.quantity = quantity;
        this.cost = cost;
        this.dayToExpiration = dayToExpiration;
        if(this.dayToExpiration>=3){
            this.isConsumable=true;
            System.out.println("Good choice!");
        }else {
            this.isConsumable=false;
            System.out.println("Check the expiration date");
        }
    }
    public Dairy(String product, int quantity){
        this.product=product;
        this.quantity=quantity;
        this.cost=5.59;
        this.dayToExpiration=5;
        this.isConsumable=true;
        System.out.println("Good choice!");

    }
    public Dairy(){
        this.product="yoghurt";
        this.quantity=4;
        this.cost=3.99;
        this.dayToExpiration=3;
        this.isConsumable=true;
        System.out.println("Good choice!");
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDayToExpiration() {
        return dayToExpiration;
    }

    public void setDayToExpiration(int dayToExpiration) {
        this.dayToExpiration = dayToExpiration;
        this.isConsumable= this.dayToExpiration >= 3;
    }

    public boolean isConsumable() {
        return isConsumable;
    }

    public String str(){
        return  "Dairy Product: " + product + ", " +
                "Quantity: " + quantity + ", " +
                "Cost: " + String.format("%.2f", cost);
    }
}
