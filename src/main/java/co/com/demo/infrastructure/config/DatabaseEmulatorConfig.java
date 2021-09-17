package co.com.demo.infrastructure.config;

import co.com.demo.domain.model.OrderRepository;
import co.com.demo.infrastructure.adapter.DataBaseAdapter2;
import co.com.demo.infrastructure.adapter.DatabaseAdapter;
import co.com.demo.infrastructure.service.DatabaseEmulator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseEmulatorConfig {

    @Bean
    public DatabaseEmulator databaseEmulator(){
        return new DatabaseEmulator();
    }

    @Bean
    public OrderRepository sqlOrderRepository(DatabaseEmulator databaseEmulator){
        return new DatabaseAdapter(databaseEmulator);
    }

    @Bean
    public OrderRepository dynamishoOrderRepository(DatabaseEmulator databaseEmulator){
        return new DataBaseAdapter2(databaseEmulator);
    }

}
