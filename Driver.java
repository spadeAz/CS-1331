public class Driver {
//    public static void main(String[] args){
//        Dairy[] dairyItems=new Dairy[2];
//        Bakery[] bakeryItems=new Bakery[4];
//        Dairy dairy=new Dairy();
//        Dairy dairy2=new Dairy("sad",2);
//        Dairy dairy3=new Dairy("sad",2,5.2,4);
//        Bakery bakery=new Bakery("tt",5,2.11);
//        Bakery bakery2=new Bakery("t2",5,2.51);
//        Bakery bakery3=new Bakery("t3",5,2.81);
//        ShoppingCart shoppingCart=new ShoppingCart();
//        shoppingCart.displayItems();
//        dairyItems[0]=dairy;
//        dairyItems[1]=dairy2;
//        bakeryItems[0]=bakery;
//        bakeryItems[2]=bakery2;
//        bakeryItems[3]=bakery3;
//        System.out.println("--------------------------------");
//        ShoppingCart shoppingCart1=new ShoppingCart(dairyItems,bakeryItems);
//        shoppingCart1.displayItems();
//        System.out.println();
//    }
    public static void main(String[] args){
        Crazy_List<Crazy_List> crazy_list=new Crazy_List<String,Crazy_List.Node>();
        crazy_list.start= crazy_list.new Node("a",1);
        crazy_list.add(crazy_list.new Node("b",2));
        crazy_list.add(crazy_list.new Node("c",18));
        crazy_list.add(crazy_list.new Node("e",2));
        crazy_list.add(crazy_list.new Node("f",20));
        Crazy_List crazy_list2=crazy_list.adults();
        crazy_list2.printList();
        crazy_list.printList();
//        System.out.println(crazy_list.printList());
    }
}
