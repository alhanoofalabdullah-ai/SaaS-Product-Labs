package src.services;

import src.models.Contract;
import java.util.*;

public class ContractService {

    private List<Contract> contracts =
            new ArrayList<>();

    private int nextId = 1;

    public void createContract(
            String name,
            String vendor,
            double value) {

        contracts.add(
                new Contract(
                        nextId++,
                        name,
                        vendor,
                        value));
    }

    public int totalContracts() {
        return contracts.size();
    }

    public double totalContractValue() {

        double total = 0;

        for (Contract contract : contracts) {
            total += contract.getValue();
        }

        return total;
    }
}
