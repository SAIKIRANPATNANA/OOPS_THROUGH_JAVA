import java.util.*;
class Product{
    String name;
    double price;
    int quantity;
    Product(String name, double price, int  quantity){
        this.name = name;
        this.price = price; 
        this.quantity = quantity;
    }
}class GroceryStore{
    static int numProducts = 0;
    static double totalRevenue = 0;
    Product[] products = new Product[100];        
    void addProduct(Product product){
        for(int i=0; i<numProducts; i++){
            if(products[i].name.equals(product.name)){
                products[i].quantity += product.quantity;
                return;
            }
        }products[numProducts] = product;
        numProducts ++;
    }void sellProduct(Product product, int quantity){
        if(product.quantity<quantity){
            System.out.println("Sorry, Insufficient Quantity..!");
            return;
        }totalRevenue += quantity*product.price;
    }void displayStats(){
        System.out.println("Products Added: ");
        for(int i=0; i<numProducts; i++){
            System.out.println(products[i].name +" "+products[i].quantity);
        }System.out.println("Total: " + totalRevenue);
    }
}public class Grocery{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        GroceryStore grocery_store = new GroceryStore();
        String cmd = "";
        while(cmd.equals("close")==false){
            System.out.println("What do you want?");
            cmd = scanner.nextLine();
            if(cmd.equals("add_product")){
                String name;
                int quantity;
                double price;
                System.out.print("Enter Product Name: ");
                name = scanner.nextLine();
                System.out.print("Enter Price: ");
                price = scanner.nextDouble();
                System.out.print("Enter Quantity: ");
                quantity = scanner.nextInt();
                scanner.nextLine();
                Product product = new Product(name,price,quantity);
                grocery_store.addProduct(product);
            }else if(cmd.equals("sell_product")){
                System.out.print("Enter Product Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Quantity: ");                       
                int quantity = scanner.nextInt();
                scanner.nextLine();
                for(int i=0; i<GroceryStore.numProducts; i++){
                    if(grocery_store.products[i].name.equals(name)){
                        grocery_store.sellProduct(grocery_store.products[i],quantity );
                        grocery_store.products[i].quantity -= quantity;                                    
                        break;
                    }
                }
            }else if(cmd.equals("display_stats")){
                grocery_store.displayStats();
            }else if(cmd=="close"){
                break;
            }
        }scanner.close();
    }
}
