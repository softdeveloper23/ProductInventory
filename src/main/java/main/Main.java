package main;

import inventory.Inventory;
import inventory.Product;
import inventory.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.productId = 1001;
        product.productName = "Computer Monitor";
        product.price = 779.99;

        Inventory inventory = new Inventory();
        inventory.product = product;
        inventory.quantity = 2;

        Warehouse warehouse = new Warehouse();
        warehouse.warehouseId = 1;
        warehouse.warehouseName = "Main Warehouse";
        warehouse.inventories = "Placeholder";

        System.out.println(inventory.toString());
    }
}
