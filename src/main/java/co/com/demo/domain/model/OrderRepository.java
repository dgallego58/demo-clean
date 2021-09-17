package co.com.demo.domain.model;

import co.com.demo.domain.usecase.ClientOrder;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {

    Optional<ClientOrder> registerNewOrder(ClientOrder order);

    List<ClientOrder> listAllByName(String productName);

}
