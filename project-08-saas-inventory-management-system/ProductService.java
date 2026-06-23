package src.services;

import src.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<Product> products = new ArrayList<>();
    private int nextId = 1;

    public void addProduct(String name, String category, int quantity, double unitPrice) {
        products.add(new Product(nextId++, name, category, quantity, unitPrice));
    }

    public Product findProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int totalProducts() {
        return products.size();
    }
}
