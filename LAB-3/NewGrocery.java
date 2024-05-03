import java.util.*;
import java.lang.*;
class Product {
    String name;
    Double price;
    int quantity;
    Product(String name, Double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}class GroceryStore {
    static int numProducts = 0;
    static int totalRevenue = 0;
    Product products[] = new Product[100];
    void add_product(String name, Double price, int quantity){
        for(int i=0; i<numProducts; i++){
            if(products[i].name.equals(name)){
                products[i].quantity += quantity;
                return;
            }
        }Product product = new Product(name, price, quantity);
        products[numProducts] = product;
        numProducts++;
        return;
    }void sell_product(String name, int quantity){
        boolean flag = true;
        for(int i=0; i<numProducts; i++){
            if(products[i].name.equals(name)){
                flag = true;
                if(products[i].quantity>=quantity){
                    products[i].quantity -= quantity;
                }else{
                    System.out.println("Sorry, Insufficient Quantity!");
                }return;
            }
        }if(flag){
            System.out.println("Sorry, Product Not Availble!");
        }return;
    }void display_stats(){
        if(numProducts==0){
            System.out.println("Sorry, No Products Are Added!");
        }else{
            System.out.println("Products Added");
        }for(int i=0; i<numProducts; i++){
            System.out.println(products[i].name+"  "+products[i].price+"  "+products[i].quantity);
        }return;
    }
}public class NewGrocery{
    public static void main(String[] args) {
        GroceryStore gs = new GroceryStore();
        gs.add_product("milk",(double)10,10);
        gs.add_product("soap",(double)20,10);
        gs.sell_product("milk", 5);
        gs.sell_product("soap", 2);
        gs.display_stats();
    }
}