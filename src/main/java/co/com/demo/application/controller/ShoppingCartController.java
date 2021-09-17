package co.com.demo.application.controller;

import co.com.demo.domain.usecase.ClientOrder;
import co.com.demo.domain.usecase.RegisterOrderUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ShoppingCartController {

    private final RegisterOrderUseCase registerOrderUseCase;

    public ShoppingCartController(RegisterOrderUseCase registerOrderUseCase) {
        this.registerOrderUseCase = registerOrderUseCase;
    }

    @PostMapping(path = "/save-order")
    public ResponseEntity<Map<String, String>> saveOrder(@RequestBody ClientOrder order) {
        var result = registerOrderUseCase.putOrderInCart(order);
        return ResponseEntity.ok(result);
    }

}
