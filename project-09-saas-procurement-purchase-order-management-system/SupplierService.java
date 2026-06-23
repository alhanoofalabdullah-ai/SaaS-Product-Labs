package src.services;

import src.models.Supplier;

import java.util.ArrayList;
import java.util.List;

public class SupplierService {

    private List<Supplier> suppliers =
            new ArrayList<>();

    private int nextId = 1;

    public void addSupplier(
            String name,
            String email) {

        suppliers.add(
                new Supplier(
                        nextId++,
                        name,
                        email));
    }

    public int totalSuppliers() {
        return suppliers.size();
    }
}
