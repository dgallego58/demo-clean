package co.com.demo.domain.usecase;

import java.util.Map;

/**
 * Input Port (para adaptador primario)
 */
public interface RegisterOrderUseCase {

    Map<String, String> putOrderInCart(ClientOrder order);

}
