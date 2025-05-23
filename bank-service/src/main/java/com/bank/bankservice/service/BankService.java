package com.bank.bankservice.service;


import com.bank.bankservice.model.Bank;
import com.bank.bankservice.repository.IBankRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BankService {
    private final IBankRepository bankRepository;

    public BankService(IBankRepository bankRepository){
        this.bankRepository=bankRepository;
    }

    public Flux<Bank> getAll(){
        return bankRepository.findAll();
    }

    public Mono<Bank> getById(Long bankId){
        return bankRepository.findById(bankId).switchIfEmpty(Mono.error(new RuntimeException("Banco no encontrado")));
    }
}
