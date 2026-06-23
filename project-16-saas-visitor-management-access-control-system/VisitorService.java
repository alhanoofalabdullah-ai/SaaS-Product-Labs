package src.services;

import src.models.Visitor;
import java.util.*;

public class VisitorService {
    private List<Visitor> visitors = new ArrayList<>();
    private int nextId = 1;

    public void registerVisitor(String name, String phone) {
        visitors.add(new Visitor(nextId++, name, phone));
    }

    public int totalVisitors() {
        return visitors.size();
    }
}
