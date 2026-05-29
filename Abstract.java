abstract class Foodorder 
{
    String customerName;
    int quantity;
    double price;
    Foodorder(String name, int quantity, double price) {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }
    abstract void orderFood();
    void generateBill() {
        double total = quantity * price;
        double d=total*0.07;
        total-=d;
        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price per item : " + price);
        System.out.println("Total dis : " + d);
        System.out.println("Total Bill : " + total);
    }
}
class Pizzaorder extends Foodorder
{
    String pizzaType;
    Pizzaorder(String name, int quantity, double price, String pizzaType) {
        super(name, quantity, price);
        this.pizzaType = pizzaType;
    }
    @Override
    void orderFood() {
        System.out.println("Welcome to Zomato");
        System.out.println("Pizza Type : " + pizzaType);
        System.out.println("Pizza ordered successfully");
    }
}
class Main {
    public static void main(String args[]) {
        Pizzaorder p = new Pizzaorder("Mounika",2,199,"chezee");
        p.orderFood();
        p.generateBill();
    }
}