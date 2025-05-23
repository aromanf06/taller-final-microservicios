package com.bank.bankservice.config;

import com.bank.bankservice.model.Bank;
import com.bank.bankservice.repository.IBankRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(IBankRepository bankRepository){
        return args -> {
            bankRepository.save(new Bank(null,"Bancolombia","Calle 16","1234"));
            bankRepository.save(new Bank(null,"Caja social","Calle 17","1235"));
            bankRepository.save(new Bank(null,"Banco de Bogota","Calle 18","1236"));
        };
    }

}
