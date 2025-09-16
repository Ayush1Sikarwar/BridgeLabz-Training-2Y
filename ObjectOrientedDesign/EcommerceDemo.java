import java.util.*;

class Product {
    String name;
    double price;
    Product(String n, double p) { name = n; price = p; }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) { products.add(p); }

    double getTotal() {
        double sum = 0;
        for (Product p : products) sum += p.price;
        return sum;
    }
}

class Customer {
    String name;
    Customer(String n) { name = n; }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order worth $" + o.getTotal());
    }
}

public class EcommerceDemo {
    public static void main(String[] args) {
        Customer c = new Customer("Emma");

        Product p1 = new Product("Laptop", 800);
        Product p2 = new Product("Mouse", 20);

        Order o = new Order();
        o.addProduct(p1);
        o.addProduct(p2);

        c.placeOrder(o);
    }
}
