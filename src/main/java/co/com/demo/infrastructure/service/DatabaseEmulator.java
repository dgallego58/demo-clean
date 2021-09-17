package co.com.demo.infrastructure.service;

import co.com.demo.domain.usecase.ClientOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseEmulator {

    private static final Map<String, ClientOrder> db = new HashMap<>();


    public ClientOrder insertIntoDb(ClientOrder order){
        return db.put(order.getCardNumber(), order);
    }

    public List<ClientOrder> findAll(){
        return (List<ClientOrder>) db.values();
    }

}
