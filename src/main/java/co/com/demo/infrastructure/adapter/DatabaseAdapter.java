package co.com.demo.infrastructure.adapter;

import co.com.demo.domain.model.OrderRepository;
import co.com.demo.domain.usecase.ClientOrder;
import co.com.demo.infrastructure.service.DatabaseEmulator;

import java.util.List;
import java.util.Optional;

public class DatabaseAdapter extends NameScannerDb implements OrderRepository {

    private final DatabaseEmulator emulator;

    public DatabaseAdapter(DatabaseEmulator emulator) {
        this.emulator = emulator;
    }

    @Override
    public Optional<ClientOrder> registerNewOrder(ClientOrder order) {
        return Optional.ofNullable(emulator.insertIntoDb(order));
    }

    @Override
    public List<ClientOrder> listAllByName(String productName) {
        return super.filterByName(emulator, productName);
    }
}
