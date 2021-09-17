package co.com.demo.application.config;

import co.com.demo.domain.model.OrderRepository;
import co.com.demo.domain.usecase.RegisterOrder;
import co.com.demo.domain.usecase.RegisterOrderUseCase;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public RegisterOrderUseCase registerOrderUseCase(@Qualifier("sqlOrderRepository") OrderRepository orderRepository){
        return RegisterOrder.registerOrderUseCase(orderRepository);
    }

}
