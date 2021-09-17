package co.com.demo.domain.usecase;

import co.com.demo.domain.model.OrderRepository;
import co.com.demo.domain.model.ShoppingCart;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class RegisterOrder implements RegisterOrderUseCase {

    private final OrderRepository orderRepository;

    private RegisterOrder(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public static RegisterOrderUseCase registerOrderUseCase(OrderRepository orderRepository){
        return new RegisterOrder(orderRepository);
    }

    @Override
    public Map<String, String> putOrderInCart(ClientOrder order) {
        ShoppingCart shoppingCart = ShoppingCart.create();
        if (shoppingCart.isGreaterThan18(order.getAge())) {
            String validCard = shoppingCart.validateCardNumber(order.getCardNumber());
            order.setCardNumber(validCard + LocalDateTime.now());
            return orderRepository.registerNewOrder(order)
                    .map(o -> {
                        var response = new HashMap<String, String>();
                        response.put("orderCreated", o.getCardNumber());
                        return response;
                    })
                    .orElseThrow();
        }
        throw new RuntimeException("Para hacer compras, debes ser mayor de edad");
    }
}
