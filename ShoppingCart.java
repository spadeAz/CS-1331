import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

public class ShoppingCart {
    private Dairy[] dairyItems;
    private Bakery[] bakeryItems;


    public ShoppingCart(Dairy[] dairyItems, Bakery[] bakeryItems) {
        this.dairyItems = dairyItems;
        this.bakeryItems = bakeryItems;
    }
    public ShoppingCart(){
        this.dairyItems=new Dairy[2];
        this.dairyItems[0]=new Dairy("Bread",1);
        this.bakeryItems=new Bakery[4];
    }

    public Bakery[] getBakeryItems() {
        return bakeryItems;
    }

    public void setBakeryItems(Bakery[] bakeryItems) {
        this.bakeryItems = bakeryItems;
    }

    public Dairy[] getDairyItems() {
        return dairyItems;
    }

    public void setDairyItems(Dairy[] dairyItems) {
        this.dairyItems = dairyItems;
    }

    public Dairy addDairyItemAtIndex(int index, Dairy dairy){

        if(index>=this.dairyItems.length||dairy==null){
            System.out.println("Cannot add Dairy item!");
            return null;
        }
        Dairy pre=this.dairyItems[index];
        if(pre==null){
            System.out.println(dairy.getProduct()+" was added here");
            return null;
        }else {
            System.out.println("There was "+pre.getProduct()+" here before");
            this.dairyItems[index]=dairy;
            return pre;
        }

    }

    public Bakery removeBakeryItemAtIndex(int index){
        if(index>=this.dairyItems.length){
            System.out.println("Invalid index entered.");
            return null;
        }
        Bakery bakery=this.bakeryItems[index];
        if(bakery==null){
            System.out.println("No Bakery item exists at this index!");
            return null;
        }else {
            System.out.println(bakery.getProduct()+" was removed from the cart.");
            this.bakeryItems[index]=null;
            return bakery;
        }
    }

    public void updateDairyQuantity(String product,int new_quantity){
        if(new_quantity<0){
            System.out.println("Invalid quantity entered.");
            return;
        }
        int flag=0;
        for(int i=0;i<dairyItems.length;i++){
            if(dairyItems[i]==null){
                continue;
            }
            if(dairyItems[i].getProduct().equalsIgnoreCase(product)){
                System.out.println(" Quantity of "+ dairyItems[i].getProduct()+" was updated from "+
                        dairyItems[i].getQuantity()+" to "+ new_quantity);
                this.dairyItems[i].setQuantity(new_quantity);
                flag=1;

            }
        }
        if(flag==0){
            System.out.println("No such Dairy item exists in the cart!");
        }
    }

    public void displayItems(){
        StringBuilder stringBuilder=new StringBuilder();
        for (Dairy dairyItem : dairyItems) {
            if(dairyItem==null){
                stringBuilder.append("null").append("\n");
            }else {
                stringBuilder.append(dairyItem.str()).append("\n");
            }
        }
        for (Bakery bakeryItem : bakeryItems) {
            if(bakeryItem==null){
                stringBuilder.append("null").append("\n");
            }else {
                stringBuilder.append(bakeryItem.str()).append("\n");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
