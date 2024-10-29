
import QA.Order;
import QA.Product;
import QA.Customer;

import java.util.*;
public class IMS {
    private Map<Integer, Customer> customers = new HashMap<>();
    private Map<Integer, Product> products = new HashMap<>();
    private Map<Integer, Order> orders = new HashMap<>();
    private  int customerIdCounter = 1;
    private  int productIdCounter = 1;
    private int orderIdCounter = 1;

    public static void main(String[] args) {
        IMS ims = new IMS();
        Scanner scn = new Scanner(System.in);
        String command;
        System.out.println("Welcome to the IMS");
        while (true) {
            System.out.println(">");
            command = scn.nextLine();

            if (command.equals("exit")) {
                break;
            }
            ims.executeCommand(command);
        }
        scn.close();
    }
    public void executeCommand(String command) {
        String[] parts = command.split(" ");
        String action = parts[0];
        switch (action) {
            case "updateCustomer":
                updateCustomers(Integer.parseInt(parts[1]), parts[2]);
                break;
            case "updateProduct":
                updateProduct(Integer.parseInt(parts[1]), parts[2]);
                break;
            case "listCustomers":
                listCustomers();
                break;
            case "listOrders":
                listOrders();
                break;
            case "listProducts":
                listProducts();
                break;
        }
    }
    private void updateCustomers(int id, String name) {
        if (customers.containsKey(id)) {
            customers.get(id).setName(name);
            System.out.println("Updated QA.Customer: " + customers.get(id));
        } else {
            System.out.println("QA.Customer not found");
        }
    }
    private void updateProduct(int id, String name) {
        if (products.containsKey(id)) {
            products.get(id).setName(name);
            System.out.println("Updated QA.Customer: " + products.get(id));
        } else {
            System.out.println("QA.Customer not found");
        }
    }
    private void listCustomers(){
        System.out.println("Customers: ");
        for (Customer customer: customers.values()) {
            System.out.println(customer);
        }
    }
    private void listProducts(){
        System.out.println("Products: ");
        for (Product product: products.values()) {
            System.out.println(product);
        }
    }
    private void listOrders(){
        System.out.println("Orders: ");
        for (Order o: orders.values()) {
            System.out.println(o);
        }
    }
}
