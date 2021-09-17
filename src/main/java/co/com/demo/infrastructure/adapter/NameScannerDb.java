package co.com.demo.infrastructure.adapter;

import co.com.demo.domain.usecase.ClientOrder;
import co.com.demo.infrastructure.service.DatabaseEmulator;

import java.util.List;
import java.util.stream.Collectors;

public class NameScannerDb {


    public List<ClientOrder> filterByName(DatabaseEmulator emulator, String productName){
        return emulator.findAll()
                .stream()
                .filter(order -> order.getProductName().equals(productName))
                .collect(Collectors.toList());
    }
}
