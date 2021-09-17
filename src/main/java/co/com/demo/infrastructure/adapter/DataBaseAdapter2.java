package co.com.demo.infrastructure.adapter;

import co.com.demo.domain.model.OrderRepository;
import co.com.demo.domain.usecase.ClientOrder;
import co.com.demo.infrastructure.service.DatabaseEmulator;

import java.util.List;
import java.util.Optional;

public class DataBaseAdapter2 extends NameScannerDb implements OrderRepository {

    private final DatabaseEmulator databaseEmulator;

    public DataBaseAdapter2(DatabaseEmulator databaseEmulator) {
        this.databaseEmulator = databaseEmulator;
    }

    @Override
    public Optional<ClientOrder> registerNewOrder(ClientOrder order) {
        return Optional.empty();
    }

    @Override
    public List<ClientOrder> listAllByName(String productName) {
        return super.filterByName(databaseEmulator, productName);
    }
}
